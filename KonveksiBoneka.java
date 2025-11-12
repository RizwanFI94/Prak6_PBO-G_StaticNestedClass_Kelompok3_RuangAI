package KonveksiBoneka;
/* Bagian Anggota 1 */
public class KonveksiBoneka {
    private static String namaKonveksi; 
    private static String lokasi;
    private static String jenisBoneka;

    public KonveksiBoneka(String namaKonveksi,String lokasi,String jenisBoneka){
        this.namaKonveksi = namaKonveksi;
        this.lokasi = lokasi;
        this.jenisBoneka = jenisBoneka;
    }
    
    public void tampilkanInfoKonveksi() {
        System.out.println("======= Info Koveksi =======");
        System.out.println("Nama Konveksi  :" + this.namaKonveksi);
        System.out.println("Lokasi         :" + this.lokasi);
        System.out.println("Jenis Boneka   :" + this.jenisBoneka);
    }
/* Bagian Anggota 2 */
    public static class Produksi {
        private String namaDesainer;
        private int jumlahBoneka;
        private int estimasiHari;
        private long biayaProduksi ;
    
        
        public Produksi(String namaDesainer, int jumlahBoneka, int estimasiHari, long biayaProduksi){
            this.namaDesainer = namaDesainer;
            this.jumlahBoneka = jumlahBoneka;
            this.estimasiHari = estimasiHari;
            this.biayaProduksi = biayaProduksi;
        }

        public void tampilkanProduksi() {
            System.out.println("\n======= Produksi =======");
            System.out.println("nama Desainer    : " + namaDesainer );
            System.out.println("Jumlah Boneka    : " + jumlahBoneka);
            System.out.println("Estimasi Hari    : " + estimasiHari); 
            System.out.println("Biaya Produksi   : " + biayaProduksi);

            long totalBiaya = jumlahBoneka * biayaProduksi;
            System.out.println("Total Biaya      : " + totalBiaya);
        }
    }
}