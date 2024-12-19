import java.util.Date;

class PengawasProyek extends TimPekerja {
    public PengawasProyek(String id, String nama) {
        super(id, nama);
    }

    @Override
    public int Gaji(int durationProject) {
        return 5000000 + (durationProject * 200000);
    }
}