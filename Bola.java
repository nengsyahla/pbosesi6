package com.neng;
import java.util.Scanner;

public class Bola extends BangunRuang {
    Scanner input = new Scanner(System.in);
    int jari;
    double phi = 3.14;
    double LuasPermukaan ;
    double Volume ;

    @Override
    public double LuasPermukaan() {
            System.out.println("MENGHITUNG LUAS PERMUKAAN BOLA");
            System.out.print("Masukan Jari - Jari : ");
            jari =input.nextInt();
            LuasPermukaan =  4 * phi * jari * jari;
            System.out.println("Luas Permukaan Bola Tersebut Adalah : "+LuasPermukaan);
            return LuasPermukaan;
    }

    @Override
    public double Volume() {
        System.out.println("MENGHITUNG VOLUME BOLA");
        System.out.print("Masukan Jari - Jari : ");
        jari =input.nextInt();
        Volume =4/3 * phi * jari * jari * jari;
        System.out.println("VOLUME Tersebut Adalah : "+Volume);
        return LuasPermukaan;

    }
    @Override
    public void display() {
        LuasPermukaan();
        Volume();

    }
}