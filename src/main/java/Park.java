public class Park {
    public static void main(String[] args) {
        Attraction attraction = new Attraction("Ракушка",100,"10-18 AM");
    }

}
class Attraction {
    Price prices;
    String name;

    public Attraction(String name,int price, String workingHours){
        this.name = name;
        Price price1 = new Price(price);
        WorkingHours workHour = new WorkingHours(workingHours);

    }

    class Price{
        int price;

        public Price(int price){
            this.price = price;
        }

    }

    class WorkingHours{
        String workingHours;

        public WorkingHours(String workingHours){
            this.workingHours = workingHours;
        }
    }

}