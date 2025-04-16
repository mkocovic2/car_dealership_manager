class Car extends Vehicle implements Serviceable {
    private int numberOfDoors;
    
    public Car(String modelName, String brand, int year, int numberOfDoors) {
        super(modelName, brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of doors: " + numberOfDoors);
    }

    @Override
    public void performStandardService() {
        System.out.println("Performing standard service on Car " + getModelName());
    }

    @Override
    public boolean checkEngineStatus(){
        System.out.println("Engine Check Status: true");
        return true; 
    }
}
