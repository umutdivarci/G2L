package Project;

/**
* This class contains various properties of the related medicine. It is mainly used by pharmacists to keep track of their stocks.
* @author Umut Divarcı
* @date 23.04.2021  
*/

public class Medicine {

    // Properties

    final String name;
    double price;
    int stock;

    // Constructors
    
    protected Medicine ( String name, double price, int stock)
    {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    
    /** 
     * Adds a certain amount of stocks of the medicine to records.
     * @param newStock
     */

    // Methods

    protected void addStock( int newStock)
    {
        stock = stock + newStock;
    }

    
    /** 
     * Removes a certain amount of stocks of the medicine from records.
     * @param usedStock
     */
    protected void removeStock( int usedStock)
    {
        stock = stock - usedStock;
    }

    
    /** 
     * Sets a new price for the medicine.
     * @param newPrice
     */
    protected void setPrice( double newPrice)
    {
        price = newPrice;
    }
}
