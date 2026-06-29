import java.util.Scanner;
class Divide{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            System.out.println(""+a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }
    }
}