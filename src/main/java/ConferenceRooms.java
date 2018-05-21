public class ConferenceRooms extends Room{

    String name;
    double rate;


    public ConferenceRooms(int capacity, double rate, String name){
        super(capacity);
        this.rate = rate;
        this.name = name;

    }

   public String getName (Guest guest){

        return guest.getName();
   }

   public String getType(){

        return this.name;
   }

    public double getRate() {
        return rate;
    }

    public int getCapacity(){

        return capacity;
    }
}
