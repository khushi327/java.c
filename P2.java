import java.util.Scanner;
class P2{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        if (a==0){
            System.out.println(a+" is zero");
        }
        if(a<0){
            System.out.println(a+" is negative");
        }
        else{
            System.out.println(a+" is positive");
        }
        sc.close();

    }
}