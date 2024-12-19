class PengawasProyek extends TimPekerja {
    public PengawasProyek(String id, String nama, Date tanggalMasuk) {
        super(id, nama, tanggalMasuk);
    }

    @Override
    public int Gaji(int durationProject) {
        return 5000000 + (durationProject * 200000);
    }
    
}