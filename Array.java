class Array{
    public static void main(String[]args){
        int[] arr ={10,40,70,90,20};
        int sum=0,avg,max=arr[0],min=arr[0];
        for(int i=0; i<5;i++){
            sum=sum+arr[i];
            if(max<arr[i]){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            System.out.println(" "+arr[i]);
        }
        avg=sum/5;
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+avg);
        System.out.println("Maximum is: "+max);
        System.out.println("Minimum is: "+min);
    }
}