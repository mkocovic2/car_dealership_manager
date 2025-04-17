import java.util.LinkedList;
import java.util.Queue;

public class Servicing {
    Queue<Serviceable> serviceQueue;

    /**
     * Constructor for Servicing.
     * Initializes the service queue.
     */
    public Servicing(){
        this.serviceQueue = new LinkedList<>();
    }

    /**
     * Adds a vehicle to the service queue if it's serviceable.
     * 
     * @param vehicle the vehicle to be added to the service queue
     * @return true if the vehicle is added, false if it's not serviceable
     */
    public boolean addVehicleToServiceQueue(Vehicle vehicle){
        if(vehicle instanceof Serviceable){
            serviceQueue.add((Serviceable) vehicle);
            System.out.println(vehicle.getModelName() + " has been added to service queue!");
            return true;
        } else {
            System.out.println(vehicle.getModelName() + " is not serviceable");
            return false;
        }
    }

    /**
     * Processes the next vehicle in the service queue.
     * No parameters. No return value.
     */
    public void processNextService(){
        if(serviceQueue.isEmpty()){
            System.out.println("Service queue is empty!");
            return; 
        }

        Serviceable nextVehicle = serviceQueue.poll();
        System.out.println("\n--- Servicing Next Vehicle ---");
        Vehicle vehicle = (Vehicle) nextVehicle;
        System.out.println("Servicing vehicle: " + vehicle.getBrand() + " " + vehicle.getModelName());
        nextVehicle.performStandardService();
        nextVehicle.checkEngineStatus();
    }
}
