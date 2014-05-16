package pkg5213100110.dvdrental;
import java.util.*;

/**
 *
 * @author Oryza Khairunni
 */
public class DVDRental {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n             RENTAL DVD");
        System.out.println("-----------------------------------");
        System.out.println("1. Input Data DVD Film");
        System.out.println("2. Input Data DVD Musik");
        System.out.println("3. Lihat Data DVD");
        System.out.println("4. Exit");
        System.out.print("\nMasukkan pilihan anda: ");
        int pilih = sc.nextInt();
        
        if (pilih == 1) {
            DVDFilm x = new DVDFilm();
            DVDFilm.inputDVDFilm(); menu();
        }
        if (pilih == 2) {
            DVDMusik y = new DVDMusik();
            DVDMusik.inputDVDMusik(); menu();
        }
        if (pilih == 3) {
            lihatDataDVD(); System.exit(0);
        }
        if (pilih == 4) {
            System.exit(0);
        }
        else {
            System.out.println("\n--Kembali ke Menu--"); menu();
        }
    }
    
    public static void lihatDataDVD() {
        DVDFilm x = new DVDFilm();
        DVDFilm.dataDVDFilm();
        
        DVDMusik y = new DVDMusik();
        DVDMusik.dataDVDMusik();
        menu();
    }
    
}
