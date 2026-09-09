import java.util.*;

class FibonacciSequence{

    public static void FibonacciSequence(int n){
       
        int a = 0;
        int b = 1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int c = b+a;
            a=b;
            b=c;
            

        }
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of Fibonacci Sequence:");
        int n = sc.nextInt();

        FibonacciSequence(n);
    }
}