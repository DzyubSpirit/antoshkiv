package GraspPatterns;

public class Location {

    private String street;
    private int num;

    Location(String street, int num){
        this.street = street;
        this.num = num;

    }

    public int getNum() {
        return num;
    }

    public String getStreet() {
        return street;
    }



}
