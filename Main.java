public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        
        Car car1 = new Car("Civic", "Honda", 2022, 4);
        Truck truck1 = new Truck("F-150", "Ford", 2021, 50.6, 21.4);
        Motorcycle moto1 = new Motorcycle("Ninja", "Kawasaki", 2023, false);
        
        dealership.addVehicle(car1);
        dealership.addVehicle(truck1);
        dealership.addVehicle(moto1);
        
        System.out.println("--- Initial Inventory ---");
        dealership.displayInventory();
        
        System.out.println("\n--- Adding to Service Queue ---");
        dealership.addVehicleToServiceQueue(car1);
        dealership.addVehicleToServiceQueue(truck1);
        dealership.addVehicleToServiceQueue(moto1);
        
        System.out.println("\n--- Processing Services (FIFO) ---");
        dealership.processNextService();
        dealership.processNextService();
        dealership.processNextService();
        
        System.out.println("\n--- Selling Vehicles ---");
        boolean sale1 = dealership.sellVehicle(truck1, "Bob Johnson", 45000.00);
        System.out.println("Sale 1 Status: " + sale1);
        
        System.out.println("\n--- Remaining Inventory ---");
        dealership.displayInventory();
        
        System.out.println("\n--- Sales History ---");
        dealership.displaySalesHistory();
    }
}