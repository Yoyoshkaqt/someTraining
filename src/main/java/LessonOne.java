public class LessonOne {
    public static void main(String[] args) {
        LessonOne lessonOne = new LessonOne();
        lessonOne.printThreeWords();
        lessonOne.checkSumSign();
        lessonOne.printColor();
        lessonOne.compareNumbers();
    }

    public void printThreeWords(){
        System.out.println("Orange \nBanana \nApple");
    }

    public void checkSumSign(){
        int a =1;
        int b =2;
        if(a+b>=0){
            System.out.println("Cумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor(){
        int value = 0;

        if(value<=0){
            System.out.println("Красный");
        }else if(value>100){
            System.out.println("Зеленый");
        }else{
            System.out.println("Желтый");
        }
    }

    public void compareNumbers(){
        int a = 3;
        int b = 4;

        if(a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
}
