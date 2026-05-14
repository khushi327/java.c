import java.util.Scanner;
class Largest_num{
    public static void main(String[]args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
             System.out.println(a+" is greater than "+b+" and "+c);
        }

        else if(c>a && c>b){
                System.out.println(c+" is greater than "+b+" and "+a);
            }
        
        else{
            System.out.println(b+" is greater than "+a+" and "+c); 
            }
        
        sc.close();
    }
}