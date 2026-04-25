public class Pesanan extends Kue{
    private double berat;

    public Pesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return berat * getHarga();
    }

    @Override
    public String toString() {
        return super.toString() + ", Berat: " + berat + " kg";
    }   
}
