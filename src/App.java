public class App {
    public static void main(String[] args) throws Exception {
        Kue[] arrayKue = new Kue[20];
        
        arrayKue[0] = new Pesanan("Kue Lapis", 50000, 2.5);
        arrayKue[1] = new Jadi("Brownies", 35000, 10);
        arrayKue[2] = new Pesanan("Kue Tart", 150000, 1.5);
        arrayKue[3] = new Jadi("Nastar", 40000, 20);
        arrayKue[4] = new Pesanan("Bolu Karamel", 60000, 1.2);
        arrayKue[5] = new Jadi("Kastengel", 45000, 15);
        arrayKue[6] = new Pesanan("Black Forest", 200000, 2.0);
        arrayKue[7] = new Jadi("Putri Salju", 40000, 25);
        arrayKue[8] = new Pesanan("Bolu Gulung", 45000, 1.0);
        arrayKue[9] = new Jadi("Kue Lumpur", 3000, 50);
        arrayKue[10] = new Pesanan("Lapis Legit", 250000, 1.8);
        arrayKue[11] = new Jadi("Kue Sus", 5000, 30);
        arrayKue[12] = new Pesanan("Cheese Cake", 180000, 1.5);
        arrayKue[13] = new Jadi("Klepon", 2000, 40);
        arrayKue[14] = new Pesanan("Kue Pukis", 25000, 3.0);
        arrayKue[15] = new Jadi("Lemper", 3500, 20);
        arrayKue[16] = new Pesanan("Red Velvet", 175000, 1.6);
        arrayKue[17] = new Jadi("Onde-onde", 2500, 35);
        arrayKue[18] = new Pesanan("Chiffon Cake", 75000, 1.1);
        arrayKue[19] = new Jadi("Risol Mayo", 4000, 25);

        double totalSemua = 0;
        for (Kue k: arrayKue) {
            totalSemua += k.hitungHarga();
        }

        double totalHargaPesanan = 0;
        for (Kue k: arrayKue) {
            if (k instanceof Pesanan) {
                totalHargaPesanan += k.hitungHarga();
            }
        }

        double totalBeratPesanan = 0;
        for (Kue k: arrayKue) {
            if (k instanceof Pesanan) {
                totalBeratPesanan += ((Pesanan) k).getBerat();
            }
        }

        double totalHargaJadi = 0;
        for (Kue k: arrayKue) {
            if (k instanceof Jadi) {
                totalHargaJadi += k.hitungHarga();
            }
        }

        double totalJumlahJadi = 0;
        for (Kue k: arrayKue) {
            if (k instanceof Jadi) {
                totalJumlahJadi += ((Jadi) k).getJumlah();
            }
        }

        System.out.println("======== DAFTAR KUE: ========");
        System.out.println("KUE PESANAN:");
        for (Kue k: arrayKue) {
            if (k instanceof Pesanan) {
                System.out.println(k.toString());
            }
        }
        
        System.out.println("\nKUE JADI:");
        for (Kue k: arrayKue) {
            if (k instanceof Jadi) {
                System.out.println(k.toString());
            }
        }

        System.out.println("\n======== Infomrasi Semua KUe ========");
        System.out.println("Total Harga Semua Kue: Rp " + totalSemua);
        System.out.println("Total Harga Kue Pesanan: Rp " + totalHargaPesanan);        
        System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan + " kg");        
        System.out.println("Total Harga Kue Jadi: Rp " + totalHargaJadi);        
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);        
        
        Kue kueTermahal = arrayKue[0];
        for (Kue k: arrayKue) {
            if (k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }
        System.out.println("Kue dengan Harga Termahal: " + kueTermahal.toString());
    }
}
