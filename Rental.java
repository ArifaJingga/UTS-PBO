import java.util.ArrayList;

public class Rental {
    private static ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
    private static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

    public static void addKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
    }
    
    public static void addPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    public static Kendaraan cekKetersediaan(String nomorPolisi) {
        for (Kendaraan kendaraan : daftarKendaraan) {
            if (kendaraan.getNomorPolisi().equals(nomorPolisi) && kendaraan.getAvailable()) {
                return kendaraan;
            }
        }
        return null;
    }
    
    public static void tampilkanDaftarKendaraan() {
        System.out.println("\nDaftar Kendaraan yang Tersedia:");
        for (Kendaraan kendaraan : daftarKendaraan) {
            kendaraan.printKendaraanInfo();
        }
    }
    
}