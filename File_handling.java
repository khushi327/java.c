import java.io.*;
class File_handling{
    public static void main(String[]args){
        BufferedReader reader=null;
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            reader=new BufferedReader(isr);
            String line=reader.readLine();
            System.out.println("You Entered:"+line);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(reader!=null)
                    reader.close();
            }
                catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        }
}