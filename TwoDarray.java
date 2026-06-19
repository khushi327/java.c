import java.util.Scanner;
class TwoDarray{
    public static void main(String[]args){
        int i,j,sum=0,max=0;
        int[][] arr=new int[3][3];
        System.out.println("Enter element in array:");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                sum=sum+arr[i][j];
                System.out.print(arr[i][j] +"  ");
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Maximum element is:"+max);
         System.out.println("sum is:"+sum);
        for(i=0;i<arr.length;i++){
            int summition=0;
            for(j=0;j<arr.length;j++){
                summition += arr[i][j];
            }
            System.out.println("Row"+(i+1)+" sum is: "+summition);
        }
        System.out.println("Diagonal element is:");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i][i]+"  ");
        }
        System.out.println(" ");

        sc.close();
    }
}