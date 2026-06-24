import java.util.Scanner;
class Rectangle1{
    double length;
    double width,area;
    void Calculatearea(){
        area= length * width;
    }
    void display(){
            System.out.println("Area:"+area);
        }

}
class Rectangle{
    public static void main(String[]args){
        Rectangle1 r=new Rectangle1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        r.length=sc.nextDouble();
        System.out.println("Enter width:");
        r.width=sc.nextDouble();
        r.Calculatearea();
        r.display();
        sc.close();
    }
}