import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TimProyek {

    private string id;
    private string nama;
    private int tanggalMasuk;
    private string anggotaTim;

    Scanner scr = new Scanner ;
    
    public string getAnggotaTim() {
        return anggotaTim;
    }

    getNama(){
        return nama;
    }

    public int getTanggalMasuk() {
        return tanggalMasuk;
    }

    abstract int gaji() {};

    sring TambahProyek(string id){
        System.out.println( "Masukkan nama Proyek:");
        string proyek = nextInt(nama);
        System.out.println( "Masukkan nama Id Peroyek:");
        string proyek = nextInt(id);
    };

    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    System.out.print("Masukkan tanggal (format: dd-MM-yyyy): ");
    String inputTanggal = scanner.nextLine();
}
