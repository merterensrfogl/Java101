package Giris;

import java.util.Scanner;

public class manavKasaProgrami
{
    public static void main(String[] args)
    {
        double toplamHesap = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);

        String[] urun = {"Elma", "Armut", "Domates", "Muz", "Patlıcan"};
        Double[] fiyat = {3.67, 2.14, 1.11, 0.95, 5.00};

        for (String x: urun)
        {
            System.out.print(x + "Kaç KG ?:");
            int kg = input.nextInt();
            toplamHesap += kg > 0 ? kg * fiyat[i]: 0;
            i++;
        }
        System.out.print("Toplam Tutar: "+ toplamHesap);


    }
}
