public class Plate {

    int foodCount;

    public Plate(){
        this.foodCount = 0;
    }

    public void addFood(int food) {
        foodCount += food;
    }

    public int takeFood(int food,Cat cat) {
        if (foodCount < food) {
            cat.setSatiety(false);
            return foodCount;

        } else {
            foodCount -= food;
            cat.setSatiety(true);
            return foodCount;
        }
    }


}
