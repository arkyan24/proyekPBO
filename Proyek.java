import java.util.Date;
import java.util.Scanner;

public class Proyek {
    public String idProyek;
    public String namaProyek;
    public String lokasi;
    public int anggaran;
    public String status;

    public Proyek(String idProyek, String namaProyek, String lokasi, int anggaran, String status) {
        this.idProyek = idProyek;
        this.namaProyek = namaProyek;
        this.lokasi = lokasi;
        this.anggaran = anggaran;
        this.status = status;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getAnggaran() {
        return anggaran;
    }

    //public abstract void changeStatus(String status) ;

    public int totalBudget() {
        return anggaran;
    }

    public void setLocation(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getStatus() {
        return status;
    }

    public void displayProject() {
        System.out.println("Proyek: " + namaProyek + ", Lokasi: " + lokasi + ", Anggaran: " + anggaran + ", Status: " + status);
    }

    public String getIdProyek() {
        return idProyek;
    }
}
