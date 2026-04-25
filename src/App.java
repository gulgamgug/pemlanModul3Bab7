public class App {
    public static void main(String[] args) throws Exception {
        Kue[] arrayKue = new Kue[20];
        
        arrayKue[0] = new KuePesanan("Kue Lapis", 50000, 2.5);
        arrayKue[1] = new KueJadi("Brownies", 35000, 10);
        arrayKue[2] = new KuePesanan("Kue Tart", 150000, 1.5);
        arrayKue[3] = new KueJadi("Nastar", 40000, 20);
        arrayKue[4] = new KuePesanan("Bolu Karamel", 60000, 1.2);
        arrayKue[5] = new KueJadi("Kastengel", 45000, 15);
        arrayKue[6] = new KuePesanan("Black Forest", 200000, 2.0);
        arrayKue[7] = new KueJadi("Putri Salju", 40000, 25);
        arrayKue[8] = new KuePesanan("Bolu Gulung", 45000, 1.0);
        arrayKue[9] = new KueJadi("Kue Lumpur", 3000, 50);
        arrayKue[10] = new KuePesanan("Lapis Legit", 250000, 1.8);
        arrayKue[11] = new KueJadi("Kue Sus", 5000, 30);
        arrayKue[12] = new KuePesanan("Cheese Cake", 180000, 1.5);
        arrayKue[13] = new KueJadi("Klepon", 2000, 40);
        arrayKue[14] = new KuePesanan("Kue Pukis", 25000, 3.0);
        arrayKue[15] = new KueJadi("Lemper", 3500, 20);
        arrayKue[16] = new KuePesanan("Red Velvet", 175000, 1.6);
        arrayKue[17] = new KueJadi("Onde-onde", 2500, 35);
        arrayKue[18] = new KuePesanan("Chiffon Cake", 75000, 1.1);
        arrayKue[19] = new KueJadi("Risol Mayo", 4000, 25);
        
        double totalSemua = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        Kue kueTermahal = arrayKue[0];
        
        for (Kue k: arrayKue) {
            totalSemua += k.hitungHarga();
            if (k instanceof KuePesanan) {
                totalHargaPesanan += k.hitungHarga();
            }
            if (k instanceof KuePesanan) {
                totalBeratPesanan += ((KuePesanan) k).getBerat();
            }
            if (k instanceof KueJadi) {
                totalHargaJadi += k.hitungHarga();
            }
            if (k instanceof KueJadi) {
                totalJumlahJadi += ((KueJadi) k).getJumlah();
            }
            if (k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
            
        }

        System.out.println("======== DAFTAR KUE: ========");
        System.out.println("KUE PESANAN:");
        for (Kue k: arrayKue) {
            if (k instanceof KuePesanan) {
                System.out.println(k.toString());
            }
        }
        
        System.out.println("\nKUE JADI:");
        for (Kue k: arrayKue) {
            if (k instanceof KueJadi) {
                System.out.println(k.toString());
            }
        }

        System.out.println("\n======== Infomrasi Semua KUe ========");
        System.out.println("Total Harga Semua Kue: Rp " + totalSemua);
        System.out.println("Total Harga Kue Pesanan: Rp " + totalHargaPesanan);        
        System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan + " kg");        
        System.out.println("Total Harga Kue Jadi: Rp " + totalHargaJadi);        
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);        
        System.out.println("Kue dengan Harga Termahal: " + kueTermahal.toString());
    }
}
