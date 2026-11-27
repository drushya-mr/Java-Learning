class SumofEvenNumbers{
    public static void main (String args[]){

        int sum = 0;
        int number = 50;
        for(int i=1;i<=number;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("sum:"+sum);
    }
}