import java.util.ArrayList;

public class Bedroom extends Room {


    private int number;
    private double rate;
    private String type;

    public Bedroom(int capacity, int number, double rate, String type ){
        super(capacity);
        this.number = number;
        this.rate = rate;
        this.type = type;
    }

    public String getName (Guest name) {

        return name.getName();
    }

    public int getRoomNumber (){

        return this.number;
    }

    public double getRate (){
        return this.rate;
    }

    public String getType(){

        return this.type;
    }

    public int getCapacity(){

        return this.capacity;
    }



}