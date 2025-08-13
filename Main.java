package skill4;
import java.util.Scanner;
class book {
    private String title;
    private String author;
    private double price;
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return "Book Title: " + title +
               "\nAuthor: " + author +
               "\nPrice: ₹" + price;
    }
}
public class Main {
    public static void main(String[] args) {
        book b1 = new book(); 
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ₹");
        double price = sc.nextDouble();
        b1.setTitle(title);
        b1.setAuthor(author);
        b1.setPrice(price);
        System.out.println("\nBook Details:");
        System.out.println(b1);
        sc.close();
    }
}