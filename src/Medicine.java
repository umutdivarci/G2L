
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

    // Methods

    protected void addStock( int newStock)
    {
        stock = stock + newStock;
    }

    protected void removeStock( int usedStock)
    {
        stock = stock - usedStock;
    }

    protected void setPrice( double newPrice)
    {
        price = newPrice;
    }
}
