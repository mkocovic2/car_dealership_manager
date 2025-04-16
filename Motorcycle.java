public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String model, String brand, int year, boolean hasSidecar) {
        super(model, brand, year);
        this.hasSidecar = hasSidecar;
    }
    
    public boolean hasSidecar() {
        return hasSidecar;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has sidecar: " + hasSidecar);
    }
}