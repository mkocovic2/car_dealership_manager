import java.time.LocalDate;

public class SalesRecord {
    private Vehicle soldVehicle;
    private String customerName;
    private double salePrice;
    private LocalDate saleDate;
    
    public SalesRecord(Vehicle soldVehicle, String customerName, double salePrice) {
        this.soldVehicle = soldVehicle;
        this.customerName = customerName;
        this.salePrice = salePrice;
        this.saleDate = LocalDate.now();
    }
    
    public Vehicle getSoldVehicle() {
        return soldVehicle;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public double getSalePrice() {
        return salePrice;
    }
    
    public LocalDate getSaleDate() {
        return saleDate;
    }
    
    public void displaySaleDetails() {
        soldVehicle.displayDetails();
        System.out.println("to " + customerName + " for $" + salePrice + " on " + saleDate);
    }
}
