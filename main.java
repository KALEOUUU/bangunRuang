package bangunRuang;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Bangun Ruang
        bangunRuang bangunRuang = new bangunRuang();

        bangunRuang.volume();
        bangunRuang.luasPermukaan();

        System.out.println("\n");

        // Scanner
        
        // balok
        balok Balok = new balok();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Balok");
        System.out.print("Masukan Panjang : ");
        Balok.p = scanner.nextDouble();
        System.out.print("Masukan Lebar : ");
        Balok.l = scanner.nextDouble();
        System.out.print("Masukan Tinggi : ");
        Balok.t = scanner.nextDouble();


        Balok.volume();
        Balok.luasPermukaan();

        // bola
        bola Bola = new bola();
        System.out.println("\nBola");
        System.out.print("Masukan jari - jari : ");
        Bola.r = scanner.nextDouble();
        Bola.r = 3;

        Bola.volume();
        Bola.luasPermukaan();

        // Limas Segitiga
        limasSegitiga LS = new limasSegitiga();
        System.out.println("\nLimas Segitiga");
        System.out.print("Masukan alas : ");
        LS.a = scanner.nextDouble();
        System.out.print("Masukan tinggi : ");
        LS.t = scanner.nextDouble();
        System.out.print("Masukan tinggi limas : ");
        LS.tLimas = scanner.nextDouble();
        System.out.print("Masukan sisi tegak : ");
        LS.b = scanner.nextDouble();

        LS.volume();
        LS.luasPermukaan();
        
        // tabung
        tabung Tabung = new tabung();
        System.out.println("\nTabung");
        System.out.println("Masukan jari jari : ");
        Tabung.r = scanner.nextDouble();
        System.out.println("Masukan tinggi tabung : ");
        
        Tabung.t = scanner.nextDouble();

        Tabung.volume();
        Tabung.luasPermukaan();
    }
}
