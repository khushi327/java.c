import java.util.Scanner;
class Swap
{
    void swap_number(int a, int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swap of this number is:"+a + " "+b);

    }
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number:");
int a = sc.nextInt();
int b = sc.nextInt();
Swap S = new Swap();
S.swap_number(a,b);
sc.close();
    }
}