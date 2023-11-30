public interface CalculationFigures {
   default void calculateCirclePerimeter(double Perimeter,double radius, double Pi){
        Perimeter=2*radius*Pi;
       System.out.println(Perimeter);
   }

   default void calculateRectanglePerimeter(double Perimeter,double a, double b){
        Perimeter=2*(a+b);
       System.out.println(Perimeter);
   }

   default void calculateTrianglePerimeter(double Perimeter, double a, double b, double c){
        Perimeter = a + b + c;
       System.out.println(Perimeter);
   }
}
