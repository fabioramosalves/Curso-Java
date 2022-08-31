package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {

        this.quantity += quantity;
    }

    public void removeProducts(int quantity) throws Exception {

        if (this.quantity > 0)
            this.quantity -= quantity;
        else
            throw new Exception("not found product in stock!");
    }

    public String toString() {
        return "Name: "
                + name
                + ", Price: "
                + String.format("%.2f", price) 
                + ", Quantity: " 
                + quantity + ", Total Value: "
                + String.format("%.2f", totalValueInStock());
    }
}