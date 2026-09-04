import java.io.*;
class Readbuffer{
    public static void main(String[]args){
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader("C:\\Users\\sonali saini\\OneDrive\\Desktop\\Khushi.java\\info.txt"));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Exception handled..!");
        }
        finally{
            try{
                if(br!=null){
                br.close();
                System.out.println("File closed successfully.");
                }
            }
            catch(IOException e){
                System.out.println("Error closing file"+e.getMessage());
            }
        }
    }
}