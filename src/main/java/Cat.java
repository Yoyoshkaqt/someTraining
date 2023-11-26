
public class Cat extends Animals {
    Plate plate = new Plate();

    public void setSatiety(boolean satiety) {

        this.satiety = satiety;
    }

    boolean satiety;
    String name;

    public Cat(String name) {
        this.name = name;
        this.satiety = false;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Raman");
        Plate plate = new Plate();
        plate.addFood(35);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Meow");
        cats[1] = new Cat("Meoow");
        cats[2] = new Cat("Meeow");
        cats[3] = new Cat("Meeoow");
        cats[4] = new Cat("Meeooww");


        for(int i = 0; i < cats.length; i++){
            plate.takeFood(18,cats[i]);
            System.out.println(cats[i].name + " "+ cats[i].satiety);
        }

    }
        public void swim(int range) {
            if (range > 0) {
                System.out.println("Котик не умеет плавать");
            }
        }

        public void run(int range) {
            if (range <= 200) {
                System.out.println("Пробежал" + " " + range + " " + "м");
            } else {
                System.out.println("Котик столько не пробежит");
            }
        }
    }





