/**
 * Abstract class representing a general Vehicle.
 */
abstract class Vehicle {
    protected String modelName;
    protected String brand;
    protected int year;

    /**
     * Constructor for Vehicle.
     * 
     * @param modelName the model name of the vehicle
     * @param brand the brand of the vehicle
     * @param year the manufacturing year of the vehicle
     */
    public Vehicle(String modelName, String brand, int year) {
        this.modelName = modelName;
        this.brand = brand;
        this.year = year;
    }

    /**
     * Gets the model name of the vehicle.
     * 
     * @return model name
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Gets the brand of the vehicle.
     * 
     * @return brand name
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Gets the manufacturing year of the vehicle.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Abstract method to display vehicle details.
     * Implemented by subclasses.
     */
    public abstract void displayDetails();
}
