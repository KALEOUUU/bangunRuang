package bangunRuang;

public class tabung extends bangunRuang{
    double pi = 3.14;
    double r, t;

    // menghitung volume tabung 
    double volume(){
        double volume = (double) (pi * r * r * t);
        System.out.println("Volume Tabung : " + volume);
        return volume;
    }

    double luasPermukaan(){
        double luasPermukaan = (double) (2 * pi * r * (r+t));
        System.out.println("Luas Permukaan Tabung : " + luasPermukaan);
        return luasPermukaan;
    }
}
