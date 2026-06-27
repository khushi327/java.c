class Mobile_1{
    private String brand,model;
    private double size;

    Mobile_1(String brand,String model,double size){
        this.brand=brand;
        this.model=model;
        this.size=size;
    }
    String getbrand(){
        return brand;
    }
    String getmodle(){
        return model;
    }
    double getsize(){
        return size;
    }
}
class Mobile{
    public static void main(String[]args){
        Mobile_1 m=new Mobile_1("Samsung","altra",6.8);
        System.out.println(" "+m.getbrand());
        System.out.println(" "+m.getmodle());
        System.out.println(" "+m.getsize());
    }
}