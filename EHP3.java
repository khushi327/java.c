class EHP3{
    public static void main(String[]args){
        int[] arr={1,2,3,4};
        try{
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        System.out.println("program Continue");
    }
}