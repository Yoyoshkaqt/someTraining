public class LessonTwo {
    public static void main(String[] args) {
        checkRange(16,5);
        System.out.println(checkRangeTwo(1,2));
        positiveOrNegative(-999999);
        System.out.println(positiveOrNegativeTwo(2));
    }

    public static void checkRange(int a, int b){
        int c = a + b;
        if(c>=10 && c<=20){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static boolean checkRangeTwo(int a, int b){
        int c = a + b;
        if(c>=10 && c<=20){
            return true;
        }else{
            return false;
        }
    }

    public static void positiveOrNegative(int a){
        if(a>=0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }
    }

    public static boolean positiveOrNegativeTwo(int a){
        if(a>=0){
            return false;
        }else {
            return true;
        }
    }
}
