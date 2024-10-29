abstract class Kendaraan {
    protected String nomorPolisi;
    protected String merk;
    protected boolean available;

    public Kendaraan(String nomorPolisi, String merk) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.available = true;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void printKendaraanInfo(){
        System.out.println("nomor polisi: " + nomorPolisi + ", merk: " + merk);
    }

    public abstract void displayInfo();
    
}
