class PrivateProject extends Proyek {
    private String namaClient;

    public PrivateProject(String idProyek, String namaProyek, String lokasi, int anggaran, String status, String namaClient) {
        super(idProyek, namaProyek, lokasi, anggaran, status);
        this.namaClient = namaClient;
    }

    public String getNamaClient() {
        return namaClient;
    }

    public void setNamaClient(String namaClient) {
        this.namaClient = namaClient;
    }

    //@Override
    //public void changeStatus(String status) {
    //    System.out.println("Status proyek pribadi diubah menjadi: " + status);
    //}

    public void displayProjectPrivate() {
        System.out.println("Proyek: " + namaProyek + ", Lokasi: " + lokasi + ", Anggaran: " + anggaran + ", Status: " + status);
    }
}