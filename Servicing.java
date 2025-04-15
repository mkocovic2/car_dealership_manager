
import java.util.LinkedList;
import java.util.Queue;

public class Servicing {
    Queue<Serviceable> serviceQueue;

    public Servicing(){
        this.serviceQueue = new LinkedList<>();
    }

    public boolean addVehicleToServiceQueue(Vehicle vehicle){
        if(vehicle instanceof Serviceable){
            serviceQueue.add((Serviceable) vehicle);
            System.out.println(vehicle.modelName + " has been added to service queue!");
            return true;
        } else {
            System.err.println(vehicle.modelName + " is not serviceable");
            return false;
        }
    }
    
    public void processNextService(){
        if(serviceQueue.isEmpty()){
            System.out.println("Service queue is empty!");
            return; 
        }

        Serviceable headQueue = serviceQueue.poll();
        System.out.println("\n--- Servicing Next Vehicle ---");
        Vehicle vehicle = (Vehicle) headQueue;
        System.out.println("Servicing vehicle: " + vehicle.getBrand() + " " + vehicle.getModelName());
    }
}
