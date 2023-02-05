package Class18ThisKeyWord;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */


    String name;
    String author;
    int publishedYear;

    Book(String name, String author){
        this.name=name;
        this.author=author;
    }

    Book(String name, String author, int publishedYear){
        this(name, author);
        this.publishedYear=publishedYear;
    }

    void printInfo(){
        System.out.println("Name of Book is "+name+" the author is "+author+" and the published year is "+publishedYear);
    }


    public static void main(String[] args) {

        Book book1=new Book("Think and grow rich","Napoleon Hill");

        book1.printInfo();

        Book book2=new Book("The Kit Runner","Khaled Hosseine",2011);

        book2.printInfo();
    }
}
