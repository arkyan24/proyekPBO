import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static final int MAX_ITEMS = 10;
    private static TenagaKerja[] tenagaKerja = new TenagaKerja[MAX_ITEMS];
    private static PengawasProyek[] pengawasProyek = new PengawasProyek[MAX_ITEMS];
    private static Kontraktor[] kontraktor = new Kontraktor[MAX_ITEMS];
    private static GovermentProject[] projectsGov = new GovermentProject[MAX_ITEMS];
    private static PrivateProject[] projectsPri = new PrivateProject[MAX_ITEMS];
    private static Service[] services = new Service[MAX_ITEMS];
    private static Material[] materials = new Material[MAX_ITEMS];

    private static int tenagaKerjaCount = 0;
    private static int pengawasProyekCount = 0;
    private static int kontraktorCount = 0;
    private static int projectCount = 0;
    private static int serviceCount = 0;
    private static int materialCount = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistem Manajemen Proyek");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));
        frame.add(panel, BorderLayout.CENTER);

        JButton createGovProjButton = new JButton("Buat Proyek Pemerintah");
        JButton createPrivProjButton = new JButton("Buat Proyek Swasta");
        JButton addTeamMemberButton = new JButton("Tambah Anggota Tim");
        JButton displayProjButton = new JButton("Tampilkan Proyek");
        JButton displayTeamButton = new JButton("Tampilkan Tim");
        JButton createServiceButton = new JButton("Buat Layanan Baru");
        JButton manageMaterialButton = new JButton("Kelola Material");
        JButton displayServiceButton = new JButton("Tampilkan Layanan");

        JTextArea displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        frame.add(scrollPane, BorderLayout.SOUTH);

        createGovProjButton.addActionListener(e -> createGovProject(displayArea));
        createPrivProjButton.addActionListener(e -> createPrivateProject(displayArea));
        addTeamMemberButton.addActionListener(e -> addTeamMember(displayArea));
        displayProjButton.addActionListener(e -> displayProjects(displayArea));
        displayTeamButton.addActionListener(e -> displayTeam(displayArea));
        createServiceButton.addActionListener(e -> createService(displayArea));
        manageMaterialButton.addActionListener(e -> manageMaterial(displayArea));
        displayServiceButton.addActionListener(e -> displayServices(displayArea));

        panel.add(createGovProjButton);
        panel.add(createPrivProjButton);
        panel.add(addTeamMemberButton);
        panel.add(displayProjButton);
        panel.add(displayTeamButton);
        panel.add(createServiceButton);
        panel.add(manageMaterialButton);
        panel.add(displayServiceButton);

        frame.setVisible(true);
    }

    private static void createGovProject(JTextArea displayArea) {
        String govProjId = JOptionPane.showInputDialog("Masukkan ID Proyek:");
        String govProjName = JOptionPane.showInputDialog("Masukkan Nama Proyek:");
        String govLocation = JOptionPane.showInputDialog("Masukkan Lokasi:");
        int govBudget = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Anggaran:"));
        String govStatus = JOptionPane.showInputDialog("Masukkan Status:");
        String institutionName = JOptionPane.showInputDialog("Masukkan Nama Lembaga:");

        projectsGov[projectCount++] = new GovermentProject(govProjId, govProjName, govLocation, govBudget, govStatus, institutionName);
        displayArea.setText("Proyek Pemerintah Dibuat: " + govProjName);
    }

    private static void createPrivateProject(JTextArea displayArea) {
        String privProjId = JOptionPane.showInputDialog("Masukkan ID Proyek:");
        String privProjName = JOptionPane.showInputDialog("Masukkan Nama Proyek:");
        String privLocation = JOptionPane.showInputDialog("Masukkan Lokasi:");
        int privBudget = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Anggaran:"));
        String privStatus = JOptionPane.showInputDialog("Masukkan Status:");
        String clientName = JOptionPane.showInputDialog("Masukkan Nama Klien:");

        projectsPri[projectCount++] = new PrivateProject(privProjId, privProjName, privLocation, privBudget, privStatus, clientName);
        displayArea.setText("Proyek Swasta Dibuat: " + privProjName);
    }

    private static void addTeamMember(JTextArea displayArea) {
        String memberId = JOptionPane.showInputDialog("Masukkan ID Anggota Tim:");
        String memberName = JOptionPane.showInputDialog("Masukkan Nama Anggota Tim:");
        String[] roles = {"Tenaga Kerja", "Pengawas Proyek", "Kontraktor"};
        String role = (String) JOptionPane.showInputDialog(null, "Pilih Jabatan", "Jabatan", JOptionPane.QUESTION_MESSAGE, null, roles, roles[0]);

        switch (role) {
            case "Tenaga Kerja":
                tenagaKerja[tenagaKerjaCount++] = new TenagaKerja(memberId, memberName);
                break;
            case "Pengawas Proyek":
                pengawasProyek[pengawasProyekCount++] = new PengawasProyek(memberId, memberName);
                break;
            case "Kontraktor":
                kontraktor[kontraktorCount++] = new Kontraktor(memberId, memberName);
                break;
        }

        displayArea.setText("Anggota Tim Ditambahkan: " + memberName);
    }

    private static void createService(JTextArea displayArea) {
        String[] serviceOptions = {"Layanan Arsitek", "Layanan Sipil"};
        String serviceType = (String) JOptionPane.showInputDialog(null, "Pilih Jenis Layanan", "Jenis Layanan", JOptionPane.QUESTION_MESSAGE, null, serviceOptions, serviceOptions[0]);

        String expertName = JOptionPane.showInputDialog("Masukkan Nama Ahli:");
        double ratePerDesign = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tarif per Desain:"));

        switch (serviceType) {
            case "Layanan Arsitek":
                services[serviceCount++] = new ArchitectService(expertName, ratePerDesign);
                break;
            case "Layanan Sipil":
                services[serviceCount++] = new CivilService(expertName, ratePerDesign);
                break;
        }

        displayArea.setText("Layanan Baru Dibuat: " + serviceType);
    }

    private static void manageMaterial(JTextArea displayArea) {
        String[] materialOptions = {"Tambah Material", "Kurangi Material", "Perbarui Harga Material", "Tampilkan Material"};
        String materialAction = (String) JOptionPane.showInputDialog(null, "Pilih Aksi", "Kelola Material", JOptionPane.QUESTION_MESSAGE, null, materialOptions, materialOptions[0]);

        String materialName = JOptionPane.showInputDialog("Masukkan Nama Material:");

        Material foundMaterial = null;
        for (Material mat : materials) {
            if (mat != null && mat.getNamaMaterial().equals(materialName)) {
                foundMaterial = mat;
                break;
            }
        }

        switch (materialAction) {
            case "Tambah Material":
                int stock = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Stok:"));
                int price = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga:"));
                materials[materialCount++] = new Material(materialName, stock, price);
                displayArea.setText("Material Baru Ditambahkan: " + materialName);
                break;
            case "Kurangi Material":
                if (foundMaterial != null) {
                    int reduceQty = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah untuk Dikurangi:"));
                    foundMaterial.reduceMaterial(reduceQty);
                    displayArea.setText("Material Dikurangi: " + materialName);
                } else {
                    displayArea.setText("Material Tidak Ditemukan.");
                }
                break;
            case "Perbarui Harga Material":
                if (foundMaterial != null) {
                    int newPrice = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Baru:"));
                    foundMaterial.updatePriceMaterial(newPrice);
                    displayArea.setText("Harga Material Diperbarui: " + materialName);
                } else {
                    displayArea.setText("Material Tidak Ditemukan.");
                }
                break;
            case "Tampilkan Material":
                if (foundMaterial != null) {
                    displayArea.setText("Material: Nama: " + foundMaterial.getNamaMaterial() + "\nStok: " + foundMaterial.getStock() + "\nHarga: " + foundMaterial.getPrice());
                } else {
                    displayArea.setText("Material Tidak Ditemukan.");
                }
                break;
        }
    }

    private static void displayProjects(JTextArea displayArea) {
        StringBuilder projects = new StringBuilder();

        for (GovermentProject govProj : projectsGov) {
            if (govProj != null) {
                projects.append("Proyek Pemerintah:\n");
                projects.append("ID: ").append(govProj.getIdProyek()).append("\n");
                projects.append("Nama: ").append(govProj.getNamaProyek()).append("\n");
                projects.append("Lokasi: ").append(govProj.getLokasi()).append("\n");
                projects.append("Anggaran: ").append(govProj.getAnggaran()).append("\n");
                projects.append("Status: ").append(govProj.getStatus()).append("\n");
                projects.append("Lembaga: ").append(govProj.getNamaLembaga()).append("\n\n");
            }
        }

        for (PrivateProject privProj : projectsPri) {
            if (privProj != null) {
                projects.append("Proyek Swasta:\n");
                projects.append("ID: ").append(privProj.getIdProyek()).append("\n");
                projects.append("Nama: ").append(privProj.getNamaProyek()).append("\n");
                projects.append("Lokasi: ").append(privProj.getLokasi()).append("\n");
                projects.append("Anggaran: ").append(privProj.getAnggaran()).append("\n");
                projects.append("Status: ").append(privProj.getStatus()).append("\n");
                projects.append("Klien: ").append(privProj.getNamaClient()).append("\n\n");
            }
        }

        displayArea.setText(projects.toString());
    }

    private static void displayTeam(JTextArea displayArea) {
        StringBuilder teamList = new StringBuilder();

        for (TenagaKerja tk : tenagaKerja) {
            if (tk != null) {
                teamList.append("Tenaga Kerja:\n");
                teamList.append("ID: ").append(tk.getId()).append("\n");
                teamList.append("Nama: ").append(tk.getNama()).append("\n\n");
            }
        }

        for (PengawasProyek pp : pengawasProyek) {
            if (pp != null) {
                teamList.append("Pengawas Proyek:\n");
                teamList.append("ID: ").append(pp.getId()).append("\n");
                teamList.append("Nama: ").append(pp.getNama()).append("\n\n");
            }
        }

        for (Kontraktor kt : kontraktor) {
            if (kt != null) {
                teamList.append("Kontraktor:\n");
                teamList.append("ID: ").append(kt.getId()).append("\n");
                teamList.append("Nama: ").append(kt.getNama()).append("\n\n");
            }
        }

        displayArea.setText(teamList.toString());
    }

    private static void displayServices(JTextArea displayArea) {
        StringBuilder servicesList = new StringBuilder();

        for (Service serv : services) {
            if (serv != null) {
                servicesList.append("Layanan:\n");
                servicesList.append("Nama Ahli: ").append(serv.getExpertName()).append("\n");
                servicesList.append("Tarif per Desain: ").append(serv.getRatePerDesign()).append("\n\n");
            }
        }

        displayArea.setText(servicesList.toString());
    }
}
