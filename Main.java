import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static List<Admin> admins = new ArrayList<>();
    static List<User> users = new ArrayList<>();
    static List<Book> books = new ArrayList<>();

    static {
        admins.add(new Admin("Raihan Hossain", "221-15-4827", "raihan4827"));
        users.add(new User("abdullah5658", "mahmud15-5658@diu.edu.bd", "221-15-4652"));
        users.add(new User("moin4652", "moin15-4652@diu.edu.bd", "221-15-4652"));
        books.add(new Book("Structure programming", "Author moinul islam", 1, 50, 50, "Raihan Hossain", 120));
        books.add(new Book("Java programming", "Author Abdullah Al Mahmud", 2, 100, 100, "Raihan Hossain", 240));
        books.add(new Book("Python programming", "Author Raihan Hossain", 3, 30, 30, "Raihan Hossain", 360));
        books.add(new Book("PHP programming", "Author Arif Uddin", 4, 60, 60, "Raihan Hossain", 420));
    }

    public static void main(String[] args) {
        homepage();
    }

    static void homepage() {
        System.out.print("\033[H\033[2J");
        System.out.println("-----LIBRARY MANAGEMENT SYSTEM-----");
        System.out.println("    -> Enter 1 for Admin Login");
        System.out.println("    -> Enter 2 for User Login");
        System.out.println("    -> Enter 3 to exit");
        System.out.print("Enter Choice : ");
        int n = Integer.parseInt(sc.nextLine());
        if (n == 1) {
            Admin.login();
        } else if (n == 2) {
            User.login();
        } else if (n == 3) {
            System.exit(0);
        } else {
            System.out.println("Invalid Choice !\nEnter correct option");
            homepage();
        }
    }
}
