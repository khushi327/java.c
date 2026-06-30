import java.util.InputMismatchException;
import java.util.Scanner;
class EHP2{
    public static void main(String[]args){
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("entered a number:");
        int n=sc.nextInt();
        System.out.println("You entered : "+n);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input.");
        }
        finally{
            System.out.println("Only work for Integer.");
        }
    }
}