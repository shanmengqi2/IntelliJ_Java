import java.util.ArrayList;

public class OopAPP {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("wangwang","jinmao");


        //BookClass in main
        Book bk1 = new Book("song of ice and fire","RRMARTIN","1**3322-88475");
        Book bk2 = new Book("song of ice and fire2","RRMARTIN","1**3322-88476");
        Book.addCollection(bk1);
        Book.addCollection(bk2);

        ArrayList < Book > bookCollection = Book.getCollection();

        for (Book book: bookCollection) {
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }

    }
}

//2. Write a Java program to create a class called "Dog" with a name and breed attribute.
//    Create two instances of the "Dog" class,
//    set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
class Dog{


    protected String name;
    protected String breed;

    public Dog(){

    }
    public Dog(String name,String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printData(){
        System.out.println(this.name);
        System.out.println(this.breed);
    }
}

//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
// and methods to add and remove books from a collection.
class Book{
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList < Book > bookCollection = new ArrayList<>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    //add
    public static void addCollection(Book bk){
        bookCollection.add(bk);
    }

    //remove
    public static void rmvCollection(Book bk){
        bookCollection.remove(bk);
    }

    //return Collection
    public static ArrayList<Book> getCollection(){
        return bookCollection;
    }
    public String get_Title() {
        return title;
    }

    public void set_Title(String title) {
        this.title = title;
    }

    public String get_Author() {
        return author;
    }

    public void set_Author(String author) {
        this.author = author;
    }

    public String get_ISBN() {
        return ISBN;
    }

    public void set_ISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
