import java.util.Scanner;
class Check_div{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a a number:");
        int a= sc.nextInt();
        if(a%5==0 && a%11==0)
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else 
        {
            System.out.println("Not exactly divisible");
        }
        sc.close();
    }
}