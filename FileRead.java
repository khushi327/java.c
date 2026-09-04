import java.io.*;
class FileRead{
    public static void main(String[]args){
        
        try{
            FileReader r=new FileReader("C:\\Users\\sonali saini\\OneDrive\\Desktop\\Khushi.java\\info.txt");
            try{
                int n;
                while((n=r.read())!=-1){
                    System.out.print((char)n);
                }
            }
            finally{
                if(r!=null){
                    r.close();
                    System.out.println("\nfile are closed.");
                }
            }
        }
        catch(IOException e){
            System.out.print("Exception handled..!");
        }
        
    }
}