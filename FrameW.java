import java.util.Scanner;
import java.util.ArrayList;
class FrameW{
    public static void main(String[]args){
        ArrayList <String> names=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arraylist");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        for(int i=0;i<n;i++){
            String name=sc.nextLine();
            names.add(name);
        }
        System.out.println(names);
        System.out.println("Enter name to update at index 1:");
        String Uname=sc.nextLine();
        names.set(0,Uname);
        System.out.println(names);
        System.out.println("Last element is remove:");
        names.remove(n-1);
        System.out.println(names);
        System.out.println("Check the string present in list:");
        String Cname=sc.nextLine();
        boolean found=names.contains(Cname);
        System.out.println("if present" +found);
        sc.close();
    }
}