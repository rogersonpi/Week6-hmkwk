public class DiningRoom extends Room{

    double rate;

    public DiningRoom (int capacity){

        super(capacity);

    }

    public String getName (Guest name){

        return name.getName();


    }

    public int getCapacity(){

        return this.capacity;

    }
    public double getRate(){

        return this.rate;
    }
}
