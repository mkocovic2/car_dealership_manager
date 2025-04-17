public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructor for Motorcycle.
     * 
     * @param model the model name of the motorcycle
     * @param brand the brand of the motorcycle
     * @param year the year the motorcycle was made
     * @param hasSidecar whether the motorcycle has a sidecar
     */
    public Motorcycle(String model, String brand, int year, boolean hasSidecar) {
        super(model, brand, year);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Checks if the motorcycle has a sidecar.
     * 
     * @return true if it has a sidecar, false otherwise
     */
    public boolean hasSidecar() {
        return hasSidecar;
    }

    /**
     * Displays the details of the motorcycle.
     * No parameters, no return value.
     */
    @Override
    public void displayDetails() {
        System.out.println("Model: " + modelName + ", Brand: " + brand + ", Year: " + year);
        System.out.println("Has sidecar: " + hasSidecar);
    }
}
