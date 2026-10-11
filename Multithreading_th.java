class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }

}
class Multithreading_th{
    public static void main(String[]args){
        MyThread th=new MyThread();
        th.start();
    }
}