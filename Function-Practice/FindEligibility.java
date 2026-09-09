import java.util.*;
class FindEligibility{

public static void VerifyAge(int age){
    if(age>=18){
        System.out.println("Eligible");
    }else{
        System.out.println("Not eligible");
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age:");
    int age = sc.nextInt();

    VerifyAge(age);
}
}