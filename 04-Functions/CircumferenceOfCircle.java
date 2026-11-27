import java.util.*;
class CircumferenceCircle{

public static float CalculateCircumference(float radius){

float circumference = 2* 3.14f* radius;
System.out.println("Circumference:"+circumference);
return circumference;
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Radius:");
    float radius = sc.nextFloat();

    CalculateCircumference(radius);
}

}
