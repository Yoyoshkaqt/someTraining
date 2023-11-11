public class LessonTwo {
    public static void main(String[] args) {
        checkRange(16, 5);
        System.out.println(checkRangeTwo(1, 2));
        positiveOrNegative(-999999);
        System.out.println(positiveOrNegativeTwo(2));

        int nums[] = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i;
            System.out.println("nums[" + i + "] = " + nums[i]);

            int some[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int x : some) {
                if (x < 6) {
                    System.out.println(x * 2);
                }
            }
        }
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
