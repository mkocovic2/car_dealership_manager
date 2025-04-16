import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Dealership {
    private String title;
    private String location;
    private ArrayList<Vehicle> inventory;
    private ArrayList<SalesRecord> salesHistory;
    private Queue<Serviceable> serviceQueue;
    
    public Dealership() {
        this.title = "Java Auto Dealership";
        this.location = "Java City";
        this.inventory = new ArrayList<>();
        this.salesHistory = new ArrayList<>();
        this.serviceQueue = new LinkedList<>();
    }
    
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    
    public void displayInventory() {
        for (Vehicle vehicle : inventory) {
            vehicle.displayDetails();
            System.out.println("----------");
        }
    }
    
    public boolean sellVehicle(Vehicle vehicleToSell, String customerName, double price) {
        if (inventory.contains(vehicleToSell)) {
            inventory.remove(vehicleToSell);
            SalesRecord SalesRecord = new SalesRecord(vehicleToSell, customerName, price);
            salesHistory.add(SalesRecord);
            SalesRecord.displaySaleDetails();
            return true;
        }
        return false;
    }
    
    public void displaySalesHistory() {
        System.out.println("Sold:");
        for (SalesRecord record : salesHistory) {
            record.displaySaleDetails();
            System.out.println("----------");
        }
    }
    
    public boolean addVehicleToServiceQueue(Vehicle vehicle) {
        if (vehicle instanceof Serviceable) {
            Serviceable serviceableVehicle = (Serviceable) vehicle;
            serviceQueue.add(serviceableVehicle);
            System.out.println("Added " + vehicle.getModelName() + " to service queue.");
            return true;
        } else {
            System.out.println(vehicle.getModelName() + " is not serviceable.");
            return false;
        }
    }
    
    public void processNextService() {
        if (serviceQueue.isEmpty()) {
            System.out.println("Service queue is empty.");
            return;
        }
        
        Serviceable nextVehicle = serviceQueue.poll();
        System.out.println("\n--- Servicing Next Vehicle ---");
        nextVehicle.performStandardService();
        nextVehicle.checkEngineStatus();
    }
}