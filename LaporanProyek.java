import java.util.Date;
import java.util.Scanner;

class LaporanProyek {
    private Proyek proyek;
    private String laporanTanggal;
    private String laporanDetailProyek;
    private String progressDetails;

    public LaporanProyek(Proyek proyek, String laporanTanggal, String laporanDetailProyek) {
        this.proyek = proyek;
        this.laporanTanggal = laporanTanggal;
        this.laporanDetailProyek = laporanDetailProyek;
        this.progressDetails = "";
    }

    public void SimpanProgress(String detail) {
        progressDetails += (progressDetails.isEmpty() ? "" : "\n") + detail;
    }

    public void DisplayProject() {
        System.out.println("Proyek:");
        System.out.println("ID Proyek: " + proyek.getIdProyek());
        System.out.println("Nama Proyek: " + proyek.getNamaProyek());
        System.out.println("Lokasi: " + proyek.getLokasi());
        System.out.println("Anggaran: " + proyek.getAnggaran());
        System.out.println("Status: " + proyek.getStatus());
        System.out.println("\nLaporan Proyek:");
        System.out.println("Tanggal: " + laporanTanggal);
        System.out.println("Detail Proyek: " + laporanDetailProyek);
        System.out.println("Progress Details:");
        System.out.println(progressDetails);
    }
}