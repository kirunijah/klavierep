package pkg5213100110.dvdrental;
import java.util.*;
/**
 *
 * @author Oryza Khairunni
 */
public class DVDFilm extends DVDRental {
    public static String title, artist, director, publisher, category;
    public static int stock;
    
    public static void inputDVDFilm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------INPUT DVD FILM-------");
        System.out.print("Title           : ");
        title = sc.nextLine();
        System.out.print("Artist          : ");
        artist = sc.nextLine();
        System.out.print("Director        : ");
        director = sc.nextLine();
        System.out.print("Publisher       : ");
        publisher = sc.nextLine();
        System.out.print("Category        : ");
        category = sc.nextLine();
        System.out.print("Stock           : ");
        stock = sc.nextInt();
    }
    
    public static void dataDVDFilm() {
        System.out.println("\n-------DATA DVD FILM-------");
        System.out.println("Title        : " + title);
        System.out.println("Artist       : " + artist);
        System.out.println("Director     : " + director);
        System.out.println("Publisher    : " + publisher);
        System.out.println("Category     : " + category);
        System.out.println("Stock        : " + stock);
    }
    
}
