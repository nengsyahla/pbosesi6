package com.neng;
import java.util.Scanner;
import com.Interfaces.*;

public class Balok extends BangunRuang implements Diagonal{
    Scanner input = new Scanner(System.in);

    int panjang,lebar,tinggi;
    int RusukPanjang = 4;
    int RusukLebar = 4;
    int RusukTinggi = 4;
    int LuasPermukaan ;
    double volume ;

    @Override
    public int RusukBangunRuang() {
        System.out.println("Jumlah Rusuk Panjang Adalah : "+RusukPanjang);
        System.out.println("Jumlah Rusuk Lebar Adalah   : "+RusukLebar);
        System.out.println("Jumlah Rusuk Tinggi Adalah  : "+RusukTinggi);

        return 12;
    }


    @Override
    public double LuasPermukaan() {
        System.out.println("======= MENGHITUNG LUAS PERMUKAAN BALOK =======");
        System.out.print("Masukan panjang : ");
        panjang =input.nextInt();
        System.out.print("Masukan Lebar   : ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi  : ");
        tinggi = input.nextInt();
        LuasPermukaan = 2 * (panjang * lebar + lebar * tinggi + panjang * tinggi);
        System.out.println("Luas Permukaan Balok Tersebut Adalah : "+LuasPermukaan);
        System.out.println("========================================================");
        return LuasPermukaan;

    }
    @Override
    public double Volume() {
        System.out.println("======= MENGHITUNG  VOLUME BALOK =======");
        System.out.print("Masukan panjang : ");
        panjang =input.nextInt();
        System.out.print("Masukan Lebar   : ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi  : ");
        tinggi = input.nextInt();
        volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok Tersebut Adalah : "+volume);
        RusukBangunRuang();
        System.out.println("========================================================");
        return volume;

    }

    @Override
    public void display() {
        LuasPermukaan();
        Volume();

    }






}