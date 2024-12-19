class Material {
    private String namaMaterial;
    private int stok;
    private int harga;

    public Material(String namaMaterial, int stok, int harga) {
        this.namaMaterial = namaMaterial;
        this.stok = stok;
        this.harga = harga;
    }

    public void displayMaterial() {
        System.out.println("Material: " + namaMaterial + ", Stok: " + stok + ", Harga: " + harga);
    }

    public void addMaterial(int jumlah) {
        this.stok += jumlah;
    }

    public void reduceMaterial(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }

    public void updatePriceMaterial(int hargaBaru) {
        this.harga = hargaBaru;
    }

    public boolean materialAvailability() {
        return this.stok > 0;
    }

    public String getNamaMaterial() {
        return namaMaterial;
    }

    public void setNamaMaterial(String namaMaterial) {
        this.namaMaterial = namaMaterial;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
