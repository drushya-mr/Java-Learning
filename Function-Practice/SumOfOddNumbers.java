
class SumOfOddNumbers{
    public static int CalculateSum(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2!=0){
                sum = sum+i;
            }
        }
        
            System.out.println("the sum of odd numbers from 1 to "+n+" is: "+sum);
            return sum;
            
        }

    public static void main(String args[]){
        int n = 500;

        CalculateSum(n);
    }
}