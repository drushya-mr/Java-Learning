import java.util.*;

class CalculationCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        double circumference = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("Circumference:"+circumference);
        System.out.println("Area:"+area);
        

    }
}