//file handling using file class
import java.io.*;
class File_HF{
    public static void main(String[]args){
        try{
            File F=new File("C:\\Users\\sonali saini\\OneDrive\\Desktop\\MY1.txt");
            if(F.createNewFile()){
                System.out.println("File is created.");
            }
            else{
                System.out.println("File is not created or already exits.");
            }
        }
        catch(IOException e){
            System.out.println("Exception is handled in File"+e);
        }
    }
}