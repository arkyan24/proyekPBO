import java.util.Date;

class Kontraktor extends TimPekerja {
    public Kontraktor(String id, String nama) {
        super(id, nama);
    }

    @Override
    public int Gaji(int durationProject) {
        return durationProject * 300000;
    }
}