import java.util.*;
class Power {
    public static void main(String args[]){

    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();

        System.out.println("Enter the exponent:");
        int exponent = sc.nextInt();

        int Result = 1;

        for(int i =1;i<=exponent;i++){
            Result =Result*base;
        }
        
        System.out.println("Result:"+Result);

    }
}