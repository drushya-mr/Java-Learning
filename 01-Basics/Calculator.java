import java.util.*;
class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter your first number:");
        int n_1=sc.nextInt();
        System.out.println("Enter your second number:");
        int n_2=sc.nextInt();

        System.out.println("1.Addition:");
        System.out.println("2.Substraction:");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division:");
        System.out.println("5.Modulus:");
        System.out.println("6.Exit:");
        System.out.println("Enter your choice:");
       
        int choice=sc.nextInt();
       
        
        switch(choice){
            case 1:System.out.println(n_1+"+"+n_2+"="+(n_1+n_2));
            break;
            case 2:System.out.println(n_1+"-"+n_2+"="+(n_1-n_2));
            break;
            case 3:System.out.println(n_1+"*"+n_2+"="+(n_1*n_2));
            break;
            case 4:System.out.println(n_1+"/"+n_2+"="+(n_1/n_2));
            break;
            case 5:System.out.println(n_1+"%"+n_2+"="+(n_1%n_2));
            break;
            case 6:System.out.println("exiting the program");
            break;

            default:System.out.println("Invalid input");
                   


        }

        

    }
}