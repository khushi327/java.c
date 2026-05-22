class Pattern{
    public static void main(String[]args){
        int i,j,k;
        for(i=1;i<=5;i++){
            for(j=i;j<=5;j++){
                System.out.print(" * ");
            }
           System.out.print("\n"); 
    }
    System.out.print("\n"); 
    for(i=1;i<=5;i++){
        for(j=1;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.print("\n");
    }
    System.out.print("\n"); 
    for(i=1;i<=5;i++){
        for(j=1;j<=i;j++){
            System.out.print(" "+j); 
        }
        System.out.print("\n"); 
    }
    System.out.print("\n"); 
    for(i=1;i<=5;i++){
        for(j=i;j<=5;j++){
            System.out.print(" "+j); 
        }
        System.out.print("\n"); 
    }
    System.out.print("\n"); 
    for(i=1;i<=5;i++){
        for(j=1;j<=i;j++){
            System.out.print(" "+i); 
        }
            System.out.print("\n"); 
    }
    System.out.print("\n"); 
    for(i=1;i<=5;i++){
        for(j=1;j<=5-i;j++){
            System.out.print(" "); 
        }
        for(k=1;k<=(2*i-1);k++){
            System.out.print("*"); 
        }
        System.out.println(""); 
    }

}

}