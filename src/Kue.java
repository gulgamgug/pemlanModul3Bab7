public abstract class Kue {
    private String nama;
    private double harga;
    
    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();
    public String toString() {
        return "Nama kue: " + nama + ", Harga: Rp " + hitungHarga() + ", Harga satuan: Rp " + harga;
    }
}
