public class Jadi extends Kue {
    private double jumlah;

    public Jadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double hitungHarga() {
        return jumlah * getHarga() * 2;
    }

    public double getJumlah() {
        return this.jumlah;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah: " + jumlah;
    }
    
}
