package Bai1;

public class Product {
    private String productID;
    private String description;
    private double price;

    public Product(String productID2, String description, double price) {
        this.productID = productID2;
        this.description = description;
        this.price = price;
    }

    public Product(int productID2, String description2, double price2) {
    }

    @Override
    public String toString() {
        return "Product [productID=" + productID + ", description=" + description + ", price=" + price + "]";
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
