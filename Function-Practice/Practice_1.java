import java.util.*;
class Practice_1{
    public static float CalculateAverage(float a,float b,float c){
        float average = (a+b+c)/3;
        System.out.println("the average of the marks is: "+ average);
        return average;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of three subjects:");
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();


    CalculateAverage(a,b,c);
}


    }
