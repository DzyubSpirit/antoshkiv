package GraspPatterns;

public class DeliveryItem {

    ProductDesc productDesc;
    private String desc;
    private int quantity;


    DeliveryItem(String desc, int quantity){
        if (productDesc.getDesc().equals(desc)){
            this.desc = desc;


        }
        this.quantity = quantity;

    }


    public double getPrice(){
        double price = 0.0;
        if (productDesc.getDesc().equals(desc)){

            price = productDesc.getPrice();

        }
        return price * quantity;


    }



}
