public class Mobil extends Kendaraan {
    public Mobil(String nomorPolisi, String merk) {
        super(nomorPolisi, merk);
    }

    @Override
    public void displayInfo() {
        System.out.println("\n(Mobil) Nomor Polisi: " + nomorPolisi + ", \nMerk mobil: " + merk);
    }
}
