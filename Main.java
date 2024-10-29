import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan identitas mahasiswa
        System.out.println("Program Rental Kendaraan");
        System.out.println("Nama Mahasiswa: Arifa");
        System.out.println("NIM: 2315101011");

        // Menambahkan data kendaraan
        Rental.addKendaraan(new Mobil("1011", "Toyota Avanza"));
        Rental.addKendaraan(new Motor("1015", "Honda Vario"));
        Rental.tampilkanDaftarKendaraan();

        // Input pelanggan
        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan ID Pelanggan: ");
        String id = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(nama, id);
        Rental.addPelanggan(pelanggan);

        // Meminjam kendaraan
        System.out.print("Masukkan Nomor Polisi Kendaraan yang Dipinjam: ");
        String nomorPolisi = scanner.nextLine();
        Kendaraan kendaraan = Rental.cekKetersediaan(nomorPolisi);

        if (kendaraan != null) {
            pelanggan.pinjamKendaraan(kendaraan);
            kendaraan.setAvailable(false);
            System.out.println("Kendaraan berhasil dipinjam.");
        } else {
            System.out.println("Kendaraan tidak tersedia.");
        }

        System.out.println("\nData Pelanggan:");
        pelanggan.getDataPelanggan();

        scanner.close();
    }
}
