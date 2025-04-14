class Truck extends Vehicle implements Serviceable {
    private double cargoWidth;
    private double cargoHeight; 
    
    public Truck(String modelName, String brand, int year, double cargoWidth, double cargoHeight){
        super(modelName, brand, year);
        this.cargoWidth = cargoWidth;
        this.cargoHeight = cargoHeight;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Cargo Size: " + cargoHeight + " X " + cargoWidth);
    }

    @Override
    public void performStandardService(){

    }

    @Override
    public boolean checkEngineStatus(){
        return true; 
    }
}
