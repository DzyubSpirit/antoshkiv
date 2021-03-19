package GraspPatterns;

public class ProductDesc {

    private String desc;
    private int itemID;
    private double price;

    public double getPrice() {
        return price;
    }

    public int getItemID() {
        return itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    ProductDesc(String desc, int itemID, double price){
        this.desc = desc;
        this.itemID = itemID;
        this.price = price;
    }


}
