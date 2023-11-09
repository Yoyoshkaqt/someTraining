public class LessonTwo {
    public static void main(String[] args) {
        checkRange(16,5);
    }

    public static void checkRange(int a, int b){
        int c = a + b;
        if(c>=10 && c<=20){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
