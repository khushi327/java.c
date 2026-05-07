import java.util.Scanner;
class Grade_calc{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks(1_100):");
        int a = sc.nextInt();
        if(90 <= a && a<=100){
            System.out.println("Grade A");
        }else if(80 <=a && a<=89){
            System.out.println("Grade B");
        }else if(70<=a && a<=79){
            System.out.println("Grade c");
        }else{
            System.out.println("Fail");
        }
        sc.close();

    }
}