import java.util.Scanner;
import java.util.ArrayList;
class ArrayLI{
public static void main(String[]args){
int addition=0;
Scanner sc=new Scanner (System.in);
ArrayList<Integer> num=new ArrayList<>();
System.out.println("Enter 5 integer:");
for(int i=0;i<5;i++){
int number=sc.nextInt();
num.add(number);
addition=number+addition;
}
double avg=addition/5.0;
System.out.println("You Enter:"+num);
System.out.println("Sum:"+addition);
System.out.println("Average:"+avg);
sc.close();
}
}