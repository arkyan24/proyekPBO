import java.util.Date;

abstract class TimPekerja {
    private String id;
    private String nama;
    private Date tanggalMasuk;
    private String idProyek;  // To store the assigned project

    public TimPekerja(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public abstract int Gaji(int durationProject);

    public void TambahProyek(String idProyek) {
        this.idProyek = idProyek;
    }

    public void HapusProyek() {
        this.idProyek = null;
    }

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

    public String getIdProyek() {
        return idProyek;
    }

}