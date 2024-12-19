class Kontraktor extends TimPekerja {
    public Kontraktor(String id, String nama, Date tanggalMasuk) {
        super(id, nama, tanggalMasuk);
    }

    @Override
    public int Gaji(int durationProject) {
        return durationProject * 300000;
    }
}