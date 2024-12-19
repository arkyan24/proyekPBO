class GovermentProject extends Proyek {
    private String namaLembaga;

    public GovermentProject(String idProyek, String namaProyek, String lokasi, int anggaran, String status, String namaLembaga) {
        super(idProyek, namaProyek, lokasi, anggaran, status);
        this.namaLembaga = namaLembaga;
    }

    public String getNamaLembaga() {
        return namaLembaga;
    }

    public void setNamaLembaga(String namaLembaga) {
        this.namaLembaga = namaLembaga;
    }

    //@Override
    //public void changeStatus(String status) {
    //    System.out.println("Status proyek pemerintah diubah menjadi: " + status);
    //}

    @Override
    public void displayProject() {
        super.displayProject();
    }

    public void displayProjectGovernment() {
        System.out.println("Proyek: " + namaProyek + ", Lokasi: " + lokasi + ", Anggaran: " + anggaran + ", Status: " + status);
    }
}