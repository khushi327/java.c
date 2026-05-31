import java.util.Scanner;
class Armstrong_no{
    public static void main(String[]args){
        int count=0,digit;
        double sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int original=n;
        int temp=n;
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        while(n!=0){
            digit=n%10;
            sum=sum+Math.pow(digit,count);
            n=n/10;
        }
        if(sum==original){
            System.out.println("number is Armstrong:");
        }else{
            System.out.println("number is not Armstrong:");
        }
        sc.close();
    }
}