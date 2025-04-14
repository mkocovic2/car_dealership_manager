class Car extends Vehicle {
    private int numberOfDoors;
    public Car(String modelName, String brand, int year, int
        numberOfDoors) {
        super(modelName, brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}