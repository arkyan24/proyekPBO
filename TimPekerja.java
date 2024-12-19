import java.util.ArrayList;
import java.util.Date;

public abstract class TimPekerja {
    private String id;
    private String nama;
    private Date tanggalMasuk;
    private ArrayList<String> anggotaTim = new ArrayList<>();

    // Constructor
    public TimPekerja(String id, String nama, Date tanggalMasuk) {
        this.id = id;
        this.nama = nama;
        this.tanggalMasuk = tanggalMasuk;
    }

    // Abstract method
    public abstract int Gaji(int durationProject);

    // Add a project to the team member's project list
    public void TambahProyek(String idProyek) {
        if (!anggotaTim.contains(idProyek)) {
            anggotaTim.add(idProyek);
        }
    }

    // Mengahpus Proyek
    public void HapusProyek(String idProyek) {
        anggotaTim.remove(idProyek);
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public ArrayList<String> getAnggotaTim() {
        return anggotaTim;
    }

    public void setAnggotaTim(ArrayList<String> anggotaTim) {
        this.anggotaTim = anggotaTim;
    }

    // Mengambil Duration dari class Proyek
    public int DurationProject(Proyek project, String idProyek) {
        return projectManager.getProjectDuration(idProyek);
    }
}