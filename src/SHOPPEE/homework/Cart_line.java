package SHOPPEE.homework;

public class Cart_line {

    private int id;
    private Product product;
    private int quantity;
    private double totalPrice;

    public Cart_line() {
    }

    public Cart_line(int id, Product product, int quantity, double totalPrice) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
    public int getProductId(){
        return product.getId();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return quantity * product.getPrice();
    }
}
