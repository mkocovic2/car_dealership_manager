abstract class Vehicle {
    protected String modelName;
    private String brand;
    private int year;

    public Vehicle(String modelName, String brand, int year) {
        this.modelName = modelName;
        this.brand = brand;
        this.year = year;
    }
    
    public String getModelName() {
        return modelName;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public int getYear() {
        return year;
    }
    
    public void displayDetails() {
        System.out.println("Model: " + modelName + ", Brand: " +
        brand + ", Year: " + year);
    }
}