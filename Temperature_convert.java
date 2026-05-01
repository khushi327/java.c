import java.util.Scanner;
class Temperature_convert{
    public static void main(String[]args){
        double c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celcius:");
        c=sc.nextInt();
        double F=(c*1.8)+3230
        ;
        System.out.println("temperature in Fahrenheit:"+F);
        sc.close();

    }
}