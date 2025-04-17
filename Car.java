class Car extends Vehicle implements Serviceable {
    private int numberOfDoors;

    /**
     * Constructor for Car.
     * 
     * @param modelName the model name of the car
     * @param brand the brand of the car
     * @param year the year the car was made
     * @param numberOfDoors number of doors the car has
     */
    public Car(String modelName, String brand, int year, int numberOfDoors) {
        super(modelName, brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Displays car details.
     * No parameters. No return value.
     */
    @Override
    public void displayDetails() {
        System.out.println("Model: " + modelName + ", Brand: " + brand + ", Year: " + year);
        System.out.println("Number of doors: " + numberOfDoors);
    }

    /**
     * Performs standard service on the car.
     * No parameters. No return value.
     */
    @Override
    public void performStandardService() {
        System.out.println("Performing standard service on Car " + getModelName());
    }

    /**
     * Checks the engine status.
     * 
     * @return true indicating engine status is good
     */
    @Override
    public boolean checkEngineStatus(){
        System.out.println("Engine Check Status: true");
        return true; 
    }
}
