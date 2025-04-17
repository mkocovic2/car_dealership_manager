import java.util.ArrayList;

public class Dealership {
    private String title;
    private String location;
    private ArrayList<Vehicle> inventory;
    private ArrayList<SalesRecord> salesHistory;
    private Servicing serviceDepartment;

    /**
     * Default constructor.
     * Initializes title, location, inventory, sales history, and service department.
     */
    public Dealership() {
        this.title = "Fordham Road Dealership";
        this.location = "Arthur Ave";
        this.inventory = new ArrayList<>();
        this.salesHistory = new ArrayList<>();
        this.serviceDepartment = new Servicing();
    }

    /**
     * Adds a vehicle to the inventory.
     * 
     * @param vehicle the vehicle to be added
     */
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    /**
     * Displays details of all vehicles in the inventory.
     * No parameters. No return value.
     */
    public void displayInventory() {
        for (Vehicle vehicle : inventory) {
            vehicle.displayDetails();
            System.out.println("----------");
        }
    }

    /**
     * Sells a vehicle, removes it from inventory, and adds to sales history.
     * 
     * @param vehicleToSell the vehicle to be sold
     * @param customerName the name of the customer
     * @param price the sale price
     * @return true if the vehicle was sold, false if not found in inventory
     */
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

    /**
     * Displays all records in the sales history.
     * No parameters. No return value.
     */
    public void displaySalesHistory() {
        System.out.println("Sold:");
        for (SalesRecord record : salesHistory) {
            record.displaySaleDetails();
            System.out.println("----------");
        }
    }

    /**
     * Displays dealership name and location.
     * No parameters. No return value.
     */
    public void displayDealerShipInfo(){
        System.out.println("Dealership Name: " + title);
        System.out.println("Dealership Location: " + location);
    }

    /**
     * Adds a vehicle to the service queue.
     * 
     * @param vehicle the vehicle to be serviced
     * @return true if added successfully, false otherwise
     */
    public boolean addVehicleToServiceQueue(Vehicle vehicle) {
        return serviceDepartment.addVehicleToServiceQueue(vehicle);
    }

    /**
     * Processes the next vehicle in the service queue.
     * No parameters. No return value.
     */
    public void processNextService() {
        serviceDepartment.processNextService();
    }
}
