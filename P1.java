import java.util.Scanner;
class P1{
    public static void main(String[]args){
        double sum,difference,product;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        double a=sc.nextInt();
        double b=sc.nextInt();
        sum=a+b;
        difference=a-b;
        product=a*b;
        System.out.println("Sum is : " + sum + ",Difference is : " + difference + ",Product is : " + product);
        sc.close();



    }
}