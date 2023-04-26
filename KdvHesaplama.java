package Giris;

import java.util.Scanner;

public class KdvHesaplama
{
    public static void main(String[] args)
    {
        double tutar;
        double kdvDeger;
        double sonFiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutar Giriniz: ");
        tutar = input.nextDouble();
        System.out.println("KDV'siz Tutar: " + tutar);

        if (tutar < 1000)
        {
            kdvDeger = tutar * 0.18;
            sonFiyat = tutar + kdvDeger;
            System.out.println("KDV değeri: %18");
            System.out.println("KDV'li Değer: "+ sonFiyat);

        }
        else
        {
            kdvDeger = tutar * 0.08;
            sonFiyat = kdvDeger + tutar;
            System.out.println("KDV değeri: %8");
            System.out.println("KDV'li Değer: "+ sonFiyat);

        }

    }
}
