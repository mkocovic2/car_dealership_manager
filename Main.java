public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Toyota", 2020, 4);
        Motorcycle myMotorcycle = new Motorcycle("Cruiser",
        "Harley-Davidson", 2022, false);
        myCar.displayDetails();
        System.out.println("-----");
        myMotorcycle.displayDetails();
    }
}