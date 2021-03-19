package GraspPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Catalog {

    List<ProductDesc> products;


    public ProductDesc searchProdDescByStr(String desc){
        for (ProductDesc lineItem : products){
            if (desc.equals(lineItem.getDesc())){
                return lineItem;
            }
        }

        throw new NoSuchElementException("No such product with id: " + desc);

    }


    public ProductDesc searchProdDesc(int itemID){
        for (ProductDesc lineItem : products){
            if (lineItem.getItemID() == itemID){
                return lineItem;
            }
        }
        throw new NoSuchElementException("No such product with id: " + itemID);
    }

}
