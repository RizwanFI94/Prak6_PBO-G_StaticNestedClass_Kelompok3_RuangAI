import KonveksiBoneka.KonveksiBoneka;

// Bagian Anggota 3
public class App {
    public static void main(String[] args)  {
        KonveksiBoneka konveksi = new KonveksiBoneka
        (" Boneka Ceria ", " Bandung ", " Teddy Bear "); 
        konveksi.tampilkanInfoKonveksi();

        KonveksiBoneka.Produksi produksi = new KonveksiBoneka.Produksi
        ("Rina", 200, 5, 50000);
        produksi.tampilkanProduksi();
    }
}