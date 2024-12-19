class TenagaKerja extends TimPekerja {
    public TenagaKerja(String id, String nama, Date tanggalMasuk) {
        super(id, nama, tanggalMasuk);
    }

    @Override
    public int Gaji(int durationProject) {
        return 3000000 + (durationProject * 100000);
    }
    
}
