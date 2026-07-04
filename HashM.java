import java.util.Scanner;
import java.util.HashMap;
class HashM{
    public static void main(String[]args){
        boolean c_id;
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> student=new HashMap<>();
        student.put(101,"Khushi");
        student.put(102,"Sonali");
        student.put(103,"Dolly");
        student.put(104,"Bharat");
        student.put(105,"Shyam");
        System.out.println(student);
        System.out.println("You want to update any student name enter id");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Write the update name:");
        String name=sc.nextLine();
        student.put(n,name);
        System.out.println(student);
        System.out.println("You want to remove any student name enter id");
        int id=sc.nextInt();
        student.remove(id);
        System.out.println(student);
        System.out.println("Enter any id to check it is exit or not:");
        int checkid=sc.nextInt();
        c_id=student.containsKey(checkid);
        if(c_id==true){
            System.out.println(c_id+" exit.");
        }else{
            System.out.println(c_id+" not exit.");
        }
        for(Integer i: student.keySet()){
            System.out.println("Key : "+ i + " Value :"+student.get(i));
        }
        sc.close();
    }
}