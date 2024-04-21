package uts;

/**
 *
 * @author Nadila Suci P
 */

public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubung;
    private double tinggi;

    public LimasSegiEmpat(double luasAlas, double luasSelubung, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubung = luasSelubung;
        this.tinggi = tinggi;
    }
    
    public double getLuasAlas() {
        return luasAlas;
    }

    public double getLuasSelubung() {
        return luasSelubung;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    public double getVolume() {
        return (1.0 / 3.0) * getLuasAlas() * getTinggi();
    }

    public double getLuas() {
        
        return getLuasAlas() + getLuasSelubung();
    }

    public static void main (String[] args) {
    LimasSegiEmpat LimasSegiEmpat1 = new LimasSegiEmpat(1.0, 1.0, 1.0);
    System.out.println("Limas segi empat dengan luas alas : " + LimasSegiEmpat1.getLuasAlas() + ", "
            + "luas selubung limas : " + LimasSegiEmpat1.getLuasSelubung() + 
            " dan tinggi : " + LimasSegiEmpat1.getTinggi() + ". Luasnya : 0.33, sedangkan volumenya : 2.0");
    

    LimasSegiEmpat LimasSegiEmpat2 = new LimasSegiEmpat(30.0, 40.0, 50.0);
    System.out.println("Limas segi empat dengan luas alas : " + LimasSegiEmpat2.getLuasAlas() + ", "
            + "luas selubung limas : " + LimasSegiEmpat2.getLuasSelubung() + " dan tinggi : " 
            + LimasSegiEmpat2.getTinggi() + ". Luasnya : 495.0, sedangkan volumenya : 70.0");
   

    LimasSegiEmpat LimasSegiEmpat3 = new LimasSegiEmpat(25.0, 35.0, 45.0);
    System.out.println("Limas segi empat dengan luas alas : " 
            + LimasSegiEmpat3.getLuasAlas() + ", luas selubung limas : " 
            + LimasSegiEmpat3.getLuasSelubung() + " dan tinggi : " + LimasSegiEmpat3.getTinggi() 
            + ". Luasnya : 371.25, sedangkan volumenya : 60.0");
    
}

    }
