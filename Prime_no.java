import java.util.Scanner;
class Prime_no{
    public static void main(String[]args){
        boolean is_prime=true;
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n<=1){
             is_prime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    is_prime=false;
                    break;
                }
            }
        }
        if(is_prime){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
        sc.close();
        
       

    }
}