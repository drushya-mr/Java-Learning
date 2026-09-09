import java.util.*;

class LargestOfTwoNumbers{
    public static int LargestNumber(int a,int b){
        int largest;
        
        if(a>b){
          largest = a;
        }else if(b>a){
        largest = b;
        }else{
            System.out.println("equal");
            return a;
        }
        System.out.println("largest is :"+largest);
        return largest;
}

        public static void main(String args[]){
           
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            LargestNumber(a,b);
        }

    }

