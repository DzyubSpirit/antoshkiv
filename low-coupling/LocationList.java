package GraspPatterns;

public class LocationList {



    Location location;
    private boolean hasDisc;

    LocationList(Location location, boolean hasDisc){
        this.location = location;
        this.hasDisc = hasDisc;

    }

    public String getLocation() {
        return location.getStreet();
    }

    public double getPriceByLocation(){
        double total = 0.0;
        if (location.getStreet().startsWith("A"))
        {
            total = 1.0;
        }
        else{
            total = 5.0;
        }

        return total;

    }


}
