class Number_Task extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
             System.out.println(" "+i);
        }
    }
}
class Letter_Task extends Thread{
    public void run(){
        for(char L ='A';L<='E';L++){
            System.out.println(" "+L);
        }
    }
}
class MultipleThread{
    public static void main(String[]args){
        Number_Task t1=new Number_Task();
        Letter_Task t2=new Letter_Task();
        t1.start();
        t2.start();
    }
}