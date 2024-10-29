public class Motor extends Kendaraan {
    public Motor(String nomorPolisi, String merk) {
        super(nomorPolisi, merk);
    }

    @Override
    public void displayInfo() {
        System.out.println("\n(Motor) Nomor Polisi: " + nomorPolisi + ", \nMerk motor: " + merk);
    }
}
