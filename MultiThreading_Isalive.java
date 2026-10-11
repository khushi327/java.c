class MultiThreading_Isalive extends Thread{
    public void run(){
        System.out.println("Thread is running.");
    }
    public static void main(String[]args){
        MultiThreading_Isalive t=new MultiThreading_Isalive();
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
    }
}