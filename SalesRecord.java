import java.time.LocalDate;

public class SalesRecord {
    private Vehicle soldVehicle;
    private String customerName;
    private double salePrice;
    private LocalDate saleDate;

    /**
     * Constructor for SalesRecord.
     * 
     * @param soldVehicle the vehicle that was sold
     * @param customerName the name of the customer who bought the vehicle
     * @param salePrice the price the vehicle was sold for
     */
    public SalesRecord(Vehicle soldVehicle, String customerName, double salePrice) {
        this.soldVehicle = soldVehicle;
        this.customerName = customerName;
        this.salePrice = salePrice;
        this.saleDate = LocalDate.now();
    }

    /**
     * Gets the sold vehicle.
     * 
     * @return the sold Vehicle object
     */
    public Vehicle getSoldVehicle() {
        return soldVehicle;
    }

    /**
     * Gets the customer name.
     * 
     * @return the name of the customer
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Gets the sale price.
     * 
     * @return the sale price of the vehicle
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * Gets the sale date.
     * 
     * @return the date the vehicle was sold
     */
    public LocalDate getSaleDate() {
        return saleDate;
    }

    /**
     * Displays sale details including vehicle info, customer name, price, and date.
     * No parameters. No return value.
     */
    public void displaySaleDetails() {
        soldVehicle.displayDetails();
        System.out.println("to " + customerName + " for $" + salePrice + " on " + saleDate);
    }
}
