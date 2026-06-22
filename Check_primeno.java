import java.util.Scanner;
class Check_primeno{
    static void is_prime(int n){
    if(n<1){
        System.out.println("Number is not prime.");
    }
    boolean prime=true;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%2==0){
            prime=false;
            break;
        }
    }
    if(prime){
        System.out.println("Number is prime.");
        }else{
            System.out.println("Number is not prime.");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        is_prime(n);
        sc.close();
    }
}