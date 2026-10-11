class My_Runnable implements Runnable{
    public void run(){
        System.out.println("run method call through runnable interface.");
    }
}
class MultiThreading_Ru{
    public static void main(String[]args){
        My_Runnable rn=new My_Runnable();
        Thread th=new Thread(rn);
        th.start();
    }
}