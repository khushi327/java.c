import java.io.*;
import java.util.Scanner;
class ReadScanner{
    public static void main(String[]args){
        Scanner sc=null;
        try{
            sc=new Scanner(new File("C:\\Users\\sonali saini\\OneDrive\\Desktop\\Khushi.java\\info.txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Exception Handled..!");
        }
        finally{
            if(sc!=null){
                sc.close();
                System.out.println("File closed successfully.");
            }
        }
    }
}