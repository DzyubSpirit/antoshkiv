package GraspPatterns;

public class SalesLineItem {

    private int quantity;
    private ProductDesc productDesc;
    private double discount;
    private double tax;

    SalesLineItem(ProductDesc productDesc, int quantity, double discount) {
        this.productDesc = productDesc;
        this.quantity = quantity;
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductDesc getProductDesc() {
        return productDesc;
    }

    public double getSubTotal(boolean includeTax) {

        if (!includeTax){
            this.tax = 1;
        }

        return (productDesc.getPrice() * quantity
                - productDesc.getPrice() * quantity * discount / 100) * productDesc.getPrice() * quantity * tax;


    }
}
