package bangunRuang;

public class balok extends bangunRuang {
    // keterangan balok
    double p;
    double l;
    double t;

    // menghitung volume
    double volume(){
        double volume = p * l * t;
        System.out.println("Volume balok : " + volume);
        return volume;
    }

    double luasPermukaan(){
        double luasPermukaan = (double) (2 * ((p*l) + (p*t) + (l*t)));
        System.out.println("Luas Permukaan Balok : " + luasPermukaan);
        return luasPermukaan;
    }
}
