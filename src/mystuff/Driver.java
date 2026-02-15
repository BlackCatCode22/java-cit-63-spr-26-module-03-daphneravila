package mystuff;

public class Driver {
    public static void main(String[]args){

        MyStuff book = new MyStuff();
        book.title = "Kindred";
        book.author = "Octavia Butler";
        book.pages = 264;

        System.out.println("Book:" + book.title);
        System.out.println("Author:" + book.author);
    }
}
