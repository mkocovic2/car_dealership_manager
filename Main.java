public class Main {
    public static void main(String[] args) {
        // Create the dealership class
        Dealership dealership = new Dealership();
        
        // Create the objects
        Car carOne = new Car("Civic", "Honda", 2022, 4);
        Truck truckOne = new Truck("F-150", "Ford", 2021, 50.6, 21.4);
        Motorcycle motoOne = new Motorcycle("Ninja", "Kawasaki", 2023, false);

        // Display dealership details, title and location
        dealership.displayDealerShipInfo();
        
        // Create the inventory of the dealership
        dealership.addVehicle(carOne);
        dealership.addVehicle(truckOne);
        dealership.addVehicle(motoOne);
        
        // Display dealership inventory 
        System.out.println("--- Initial Inventory ---");
        dealership.displayInventory();
        
        // Add to the service queue
        System.out.println("\n--- Adding to Service Queue ---");
        dealership.addVehicleToServiceQueue(carOne);
        dealership.addVehicleToServiceQueue(truckOne);
        dealership.addVehicleToServiceQueue(motoOne);
        
        // Process all the services
        System.out.println("\n--- Processing Services (FIFO) ---");
        dealership.processNextService();
        dealership.processNextService();
        dealership.processNextService();

        // Sell the vehicles
        System.out.println("\n--- Selling Vehicles ---");
        boolean sale1 = dealership.sellVehicle(truckOne, "Bob Johnson", 45000.00);
        System.out.println("Sale 1 Status: " + sale1);
        
        // Display the remaining inventory
        System.out.println("\n--- Remaining Inventory ---");
        dealership.displayInventory();
        
        // Show sales history
        System.out.println("\n--- Sales History ---");
        dealership.displaySalesHistory();
    }
}