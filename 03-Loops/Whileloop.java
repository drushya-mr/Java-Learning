import java.util.*;
class Whileloop{
public static double PerformDivision(double a,double b){
    
    while(true){
        double division = a/b;
        System.out.println("division:"+division);
        return division;
    } 
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    double a = sc.nextDouble();
    double b = sc.nextDouble();

    PerformDivision(a,b);

}
}
