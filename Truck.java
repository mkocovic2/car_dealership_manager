/**
 * Truck class extending Vehicle and implementing Serviceable.
 */
class Truck extends Vehicle implements Serviceable {
    private double cargoWidth;
    private double cargoHeight; 

    /**
     * Constructor for Truck.
     * 
     * @param modelName the model name of the truck
     * @param brand the brand of the truck
     * @param year the manufacturing year
     * @param cargoWidth the width of the cargo area
     * @param cargoHeight the height of the cargo area
     */
    public Truck(String modelName, String brand, int year, double cargoWidth, double cargoHeight){
        super(modelName, brand, year);
        this.cargoWidth = cargoWidth;
        this.cargoHeight = cargoHeight;
    }

    /**
     * Displays truck details.
     * No parameters. No return value.
     */
    @Override
    public void displayDetails() {
        System.out.println("Model: " + modelName + ", Brand: " + brand + ", Year: " + year);
        System.out.println("Cargo Size: " + cargoHeight + " X " + cargoWidth);
    }

    /**
     * Performs standard service for the truck.
     * No parameters. No return value.
     */
    @Override
    public void performStandardService() {
        System.out.println("Performing standard service on Truck " + getModelName());
    }

    /**
     * Checks the engine status.
     * 
     * @return true always (mocked for this example)
     */
    @Override
    public boolean checkEngineStatus() {
        System.out.println("Engine Check Status: true");
        return true;
    }
}
