import java.util.Scanner;
class P5{
    public static void main(String[]args){
        int choise,n;
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        System.out.println("Enter (1) to check it is even/odd or (2)positive/negative:");
        choise =sc.nextInt();
        switch(choise){
            case 1:
                if(n%2==0){
                    System.out.println("Number is even");
                }
                else{
                    System.out.println("number is odd");
                }
                break;
            case 2:
                if(n>0){
                    System.out.println("Number is positive");
                }
                else{
                    System.out.println("Number is negative");
                }
                break;
            default:
                System.out.println("Invald: Enter valid number");
                return;
                
        }
        sc.close();
    }
}
