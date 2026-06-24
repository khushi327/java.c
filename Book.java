class Book1{
    String title;
    String author;
    double price;
    void display(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
    }
}
class Book{
    public static void main(System[]args){
        Book1 b=new Book1();
        b.title="Jungle Book";
        b.author="Rudyard Kipling";
        b.price=328.11;
        b.display();
    }
}