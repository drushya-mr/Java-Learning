import java.util.*;
public class SimpleCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        
        int addition = a + b;
        int subtraction =  a  -  b;
        int multiplication = a*b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("1.Addition :");
        System.out.println("2.Subtraction:");
        System.out.println("3.Multiplication :");
        System.out.println("4.Division :");
        System.out.println("5.Modulus :");
        System.out.println("6.Exit");

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        
       
        switch(choice){
            case 1:
                System.out.println("Addition is:"+addition);
                break;
            case 2:
                System.out.println("Subtraction is:"+subtraction);
                break;
            case 3:
                System.out.println("Multiplication is:"+multiplication);
                break;
            case 4:
                System.out.println("Division is:"+division);
                break;
            case 5:
                System.out.println("Modulus is:"+modulus);
                break;
            case 6:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
    
}
