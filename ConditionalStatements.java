import java.util.*;
class ConditionalStatements {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        if(num_1==num_2){
            System.out.println("equal");
        }else if(num_1>num_2){
            System.out.println("num_1 is greater");
        }else{
            System.out.println("num_1 is lesser");
        }
    }
}
        