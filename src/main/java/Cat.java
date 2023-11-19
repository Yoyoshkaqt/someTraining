public class Cat extends Animals{
    public static void main(String[] args) {
        Animals cat = new Cat();
        cat.run(250);
        cat.swim(1);
    }
    public void run(int range){
        if(range <=200){
            System.out.println("Пробежал"+" "+range+" "+"м");
        }else{
            System.out.println("Котик столько не пробежит");
        }
    }

    public void swim(int range){
        if(range > 0){
            System.out.println("Котик не умеет плавать");
        }
    }
}
