package pkg5213100110.dvdrental;
import java.util.*;

/**
 *
 * @author Oryza Khairunni
 */
public class DVDMusik extends DVDRental{
    public static String title, singer, producer, publisher, tophits, category;
    public static int stock;
    
    public static void inputDVDMusik() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------INPUT DVD MUSIK-------");
        System.out.print("Title           : ");
        title = sc.nextLine();
        System.out.print("Singer          : ");
        singer = sc.nextLine();
        System.out.print("Producer        : ");
        producer = sc.nextLine();
        System.out.print("Publisher       : ");
        publisher = sc.nextLine();
        System.out.print("Top Hits        : ");
        tophits = sc.nextLine();
        System.out.print("Category        : ");
        category = sc.nextLine();
        System.out.print("Stock           : ");
        stock = sc.nextInt();
    }
    
    public static void dataDVDMusik() {
        System.out.println("\n-------DATA DVD MUSIK-------");
        System.out.println("Title        : " + title);
        System.out.println("Singer       : " + singer);
        System.out.println("Producer     : " + producer);
        System.out.println("Publisher    : " + publisher);
        System.out.println("Top Hits     : " + tophits);
        System.out.println("Category     : " + category);
        System.out.println("Stock        : " + stock);
    }
}
