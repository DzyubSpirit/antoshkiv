package GraspPatterns;

import java.util.List;
import java.util.NoSuchElementException;

public class DeliveryLine {

    List <DeliveryItem> deliveryItem;//fixme list
     List <LocationList> locationList;
   // List<String> streetsFinalArray;



    DeliveryLine(DeliveryItem deliveryItem, int num, String street){
        this.deliveryItem = (List<DeliveryItem>) deliveryItem;
        if (checkLocation(num, street)){
            locationList.add(new LocationList(new Location(street, num), false));
        }


    }
    // example of high coupling?
    public double getPriceByLocationAndDelivery(DeliveryItem deliveryItem, LocationList locationList){

        return deliveryItem.getPrice() * locationList.getPriceByLocation();

    }



    public void addToLocation(Location location){
        for (String str: streetsFinalArray){
            if (!location.getStreet().equals(str)){
                locationList.add(new LocationList(location, true));
            }
        }
        throw new NoSuchElementException("already exist" + location.getStreet());
    }


    public boolean checkLocation(int num, String street){
        for (LocationList locItem: locationList){
            if (locItem.getLocation().equals(street)) {
                return true;
            }
        }
        return false;


    }

}
