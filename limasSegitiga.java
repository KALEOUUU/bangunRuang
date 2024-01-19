package bangunRuang;

public class limasSegitiga extends bangunRuang{
    double a;
    double t;
    double tLimas;
    double b;

    // mengitung volume
    double volume(){
        double volume = (double) (a * t * tLimas);
        System.out.println("Volume Limas Segitiga : " + volume);
        return volume;
    }
    // menghitung Luas Permukaaan
    double luasPermukaan(){
        double luasPermukaan = (double) ((3*a*t/2) * b);
        System.out.println("Luas Limas Segitiga : " + luasPermukaan);
        return luasPermukaan;
    }
}
