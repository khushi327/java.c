import java.util.Scanner;
class loops{
    public static void main(String[]args){
        int i,f=1;
        for(i=1;i<=100;i++){
            System.out.print(" "+i);
        }
        System.out.println("\n Even number is: ");
        for(i=1;i<=50;i++){
            if(i%2==0){
                System.out.print(" "+i);
            }
        }
        System.out.println("\n Enter the number to print the Table:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        System.out.println("Enter the number to find the Factorial:");
        int number = sc.nextInt();
        int originalnum=number;
        while(originalnum>1){
            f=f*originalnum;
            originalnum--;
        }
        System.out.println("Factorial of " +number+" is : "+f);
        System.out.println("\nsum of first n  number:");
        int sum=0;
        while(n>0)
        {
            sum=sum+n;
            n--;
        }
        System.out.println(" "+sum);
        System.out.println("Enter number to reverse:");
        int origin=sc.nextInt();
        int temp=origin;
        int reverse=0;
        while(temp!=0){
        int digit = temp % 10;
        reverse=reverse*10+digit;
        temp/=10;
        }
        System.out.println(" "+reverse);
        if(origin==reverse)
        {
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }





        sc.close();

    }
}