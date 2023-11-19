public class Dog extends Animals{
    public static void main(String[] args) {
        Animals dog = new Dog();
        dog.run(501);
        dog.swim(11);
    }

    public void run(int range){
        if(range <=500){
            System.out.println("Пробежал"+" "+range+" "+"м");
        }else {
            System.out.println("Собачка столько не пробежит");
        }
    }

    public void swim(int range){
        if(range <= 10){
            System.out.println("Проплыл"+" "+range+" "+"м");
        }else{
            System.out.println("Собачка столько не проплывёт");
        }
    }
}
