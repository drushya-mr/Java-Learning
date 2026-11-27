import java.util.Scanner;
class ATMMenu{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();

        while(true){
            System.out.println("ATM Menu:");
            System.out.println("1.Check Balance:");
            System.out.println("2.Deposit Amount:");
            System.out.println("3.Withdraw Amount:");
            System.out.println("4.Exit:");
            
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch(choice){
                case 1: System.out.println("Balance is "+balance);
                break;

                case 2: System.out.println("Enter the amount to deposit:");
                double deposit = sc.nextDouble();

                balance = deposit + balance;
                System.out.println("Balance:"+balance);
                break;

                case 3: System.out.println("Enter the amount to Withdraw:");
                double withdraw = sc.nextDouble();

                if(withdraw<=balance && withdraw>0){
                    balance = balance - withdraw;
                    System.out.println("Balance:"+balance);
                }else if(withdraw>balance){
                    System.out.println("Insufficient Balance");
                }else{
                    System.out.println("Invalid Amount");
                }
                break;

                case 4:System.out.println("Transaction Completed");
                break;

              

            }
        }
        
    }
}