class Employe{
    void Work(){
        System.out.println("Employee is work.");
    }
}
class Developer extends Employe{
    @Override
    void Work(){
        System.out.println("Developer is work.");
    }
}
class Tester extends Employe{
    @Override
    void Work(){
        System.out.println("Tester is work.");
    }
}
class Company{
    public static void main(String[]args){
        Developer d=new Developer();
        Tester t=new Tester();
        d.Work();
        t.Work();
    }
}