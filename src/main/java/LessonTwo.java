import java.util.Arrays;

public class LessonTwo {
    public static void main(String[] args) {
        checkRange(16, 5);
        System.out.println(checkRangeTwo(1, 2));
        positiveOrNegative(-999999);
        System.out.println(positiveOrNegativeTwo(2));
        printSomeThere("Print",3);
        System.out.println(Arrays.toString(newArray(25,44)));
          System.out.println(checkYears(800));

        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i;
            System.out.println("nums[" + i + "] = " + nums[i]);
        }

        int[] some = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int x : some) {
            if (x < 6) {
                System.out.println(x * 2);
            }
        }

        int[] repl = {1,1,0,0,1,0,1,1,0,0};
        for(int i = 0;i < repl.length;i++){
            if(repl[i] == 0){
                repl[i] = 1;
            } else if(repl[i]==1){
                repl[i] = 0;
            }
            System.out.println(repl[i]);
            }
    }


    public static void checkRange(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean checkRangeTwo(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean positiveOrNegativeTwo(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printSomeThere(String a, int b) {
        int counter = b;
        for (int i = 0; i < counter; i++) {
            System.out.println(a);
        }
    }

    public static int[] newArray(int len, int initialValue) {
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            len = numbers.length;
            numbers[i] = initialValue;
        }
        return numbers;

    }

    public static boolean checkYears(int year) {
        if(year % 4 !=0 & year % 400 !=0 ){
            return false;
        }else if(year % 100 !=0){
            return true;
        }else if(year % 400 !=0){
            return false;
        }
        return true;
    }
}
