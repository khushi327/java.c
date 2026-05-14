import java.util.Scanner;
class largest_no{
    public static void main(String[]args)
    {
        int a,b;
        System.out.println("Enter two number:");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
        if(a<b){
            System.out.println(b+" greater than "+a);
        }
        else{
         System.out.println(a+" greater than "+b);
         sc.close();
        }
    }
}