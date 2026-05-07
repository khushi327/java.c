import java.util.Scanner;
class Days{
    public static void main(String[]args){
        int choise;
        System.out.println("Enter number(1-7):");
        Scanner sc=new Scanner(System.in);
        choise = sc.nextInt();
        switch(choise){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:    
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid number.");
                return;

        }
        sc.close();

    }
}

