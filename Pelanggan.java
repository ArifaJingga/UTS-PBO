import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String id;
    ArrayList<Kendaraan> kendaraanDipinjam = new ArrayList<>();

    public Pelanggan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void pinjamKendaraan(Kendaraan kendaraan) {
        kendaraanDipinjam.add(kendaraan);
    }

    public void getDataPelanggan() {
        System.out.println("\nNama: " + nama + ", \nID: " + id);
        System.out.println("Kendaraan Dipinjam: ");
        for (Kendaraan kendaraan : kendaraanDipinjam) {
            kendaraan.displayInfo();
        }
    }
}
