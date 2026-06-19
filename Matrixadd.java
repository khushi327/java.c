import java.util.Scanner;
class Matrixadd{
    public static void main(String[]args){
        int i,j;
        int[][] M1=new int[2][2];
        int[][] M2=new int[2][2];
        int[][] M3=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element in Matrix1:");
        for(i=0;i<M1.length;i++){
            for(j=0;j<M1.length;j++){
                M1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element in Matrix2:");
        for(i=0;i<M2.length;i++){
            for(j=0;j<M2.length;j++){
                M2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum of Matrix1 and Matrix 2 is:");
        for(i=0;i<M3.length;i++){
            for(j=0;j<M3.length;j++){
                M3[i][j]=M1[i][j]+M2[i][j];
                System.out.print(M3[i][j]+"  ");
            }
            System.out.println("");
        }
        sc.close();

    }
}