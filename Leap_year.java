import java.util.Scanner;
class Leap_year{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        int n = sc.nextInt();
        if((n%4==0 && n%100!=0) || n%400==0){
           System.out.println("Year is leap Year"); 
        }
        else{
            System.out.println("Year is not leap Year");
        }
        sc.close();

    }
}