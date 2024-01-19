package bangunRuang;

public class bola extends bangunRuang{
    double r;
    double pi = 3.14;

    // mengitung volume
    double volume(){
        double volume = (double) (4 * pi * r * r * r / 3);
        System.out.println("Volume bola : " + volume);
        return volume;
    }
    double luasPermukaan(){
        double luasPermukaan = (double)(4 * pi * r * r);
        System.out.println("Luas Permukaan Bola : " + luasPermukaan);
        return luasPermukaan;

    }
}
