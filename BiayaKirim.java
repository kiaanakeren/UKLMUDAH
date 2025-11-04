import java.util.*;

public class BiayaKirim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Program Hitung Biaya Pengiriman");
        System.out.print("Berat paket (kg): ");
        double berat = in.nextDouble();
        System.out.print("Jarak tempuh (km): ");
        double jarak = in.nextDouble();
        System.out.print("Panjang (cm): ");
        double p = in.nextDouble();
        System.out.print("Lebar (cm): ");
        double l = in.nextDouble();
        System.out.print("Tinggi (cm): ");
        double t = in.nextDouble();

        double volume = p * l * t;                 
        double tarif = (jarak <= 10) ? 4250 : 6000; 
        double total = berat * tarif;              

        if (volume > 100) total += 50000;          

        System.out.println("RINCIAN");
        System.out.println("Volume: " + volume + " cm^3");
        System.out.println("Tarif per kg: Rp " + tarif);
        System.out.println("Biaya berat: Rp " + (berat * tarif));
        if (volume > 100) System.out.println("Tambahan volume: Rp 50000");
        System.out.println("TOTAL BIAYA: Rp " + total);
    }
}
