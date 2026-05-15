import java.util.Scanner;
class Operater_s{
    public static void main(String[]args){
        double a,b,Result=0;
        char choise;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number and one operator");
        a=sc.nextDouble();
        b=sc.nextDouble();
        choise=sc.next().charAt(0);
        switch(choise){
            case '+':
                Result=a+b;
                break;
            case '-':
                Result=a-b;
                break;
            case '*':
                Result=a*b;
                break;
            case '/':
                if(b!=0){
                Result=a/b; 
                }
                else{
                    System.out.println("error : division by zero.");
                }
                break;
            default:
                System.out.println("not valid");
                return;
        }
        System.out.println("Result is: "+Result);
        sc.close();

    }
}