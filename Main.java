public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TimPekerja> pekerjaList = new ArrayList<>();

        System.out.println("=== Input Data Tim Pekerja ===");

        while (true) {
            System.out.println("Pilih jenis pekerja:");
            System.out.println("1. Pengawas Proyek");
            System.out.println("2. Kontraktor");
            System.out.println("3. Tenaga Kerja");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (pilihan == 4) {
                break;
            }

            System.out.print("Masukkan ID: ");
            String id = scanner.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Tanggal Masuk (yyyy-MM-dd): ");
            String tanggalMasukInput = scanner.nextLine();
            Date tanggalMasuk = new Date(); // Replace with date parsing logic if needed

            TimPekerja pekerja = null;

            switch (pilihan) {
                case 1:
                    pekerja = new PengawasProyek(id, nama, tanggalMasuk);
                    break;
                case 2:
                    pekerja = new Kontraktor(id, nama, tanggalMasuk);
                    break;
                case 3:
                    pekerja = new TenagaKerja(id, nama, tanggalMasuk);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            pekerjaList.add(pekerja);
            System.out.println("Pekerja berhasil ditambahkan!\n");
        }

        System.out.println("\n=== Daftar Tim Pekerja ===");
        for (TimPekerja pekerja : pekerjaList) {
            System.out.println("ID: " + pekerja.getId() + ", Nama: " + pekerja.getNama());
        }

        scanner.close();
    }
}