class Motorcycle extends Vehicle {
    private boolean hasSideCar;
    
    public Motorcycle(String modelName, String brand, int year, boolean hasSideCar) {
        super(modelName, brand, year);
        this.hasSideCar = hasSideCar;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has sidecar: " + hasSideCar);
    }
}