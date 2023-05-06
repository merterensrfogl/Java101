package Giris;

import java.util.Scanner;

public class ucakBileti
{
    public static void main(String[] args)
    {
       int mesafe;
       int yas;
       int tip;
       double kmUcret = 0.10;
       double toplam;

       Scanner input = new Scanner(System.in);
       System.out.print("Gideceğiniz mesafeyi giriniz: ");
       mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Bilet Türü\n1 = Tek Yön\n2 = Gidiş-DÖnüş\nSeçim: ");
        tip = input.nextInt();

        if ((tip < 1) && (tip > 2))
        {
            System.out.print("Hatalı Seçim Yaptınız!");
        }
        else
        {
            toplam = (mesafe * kmUcret) * tip;
            if (yas < 12) toplam *= 0.50;
            else if (yas < 24) toplam *= 0.20;
            else if (yas > 65) toplam *= 0.30;
            if (tip == 2) toplam -= (toplam * 0.20);
            System.out.print("Toplam tutar "+ toplam + "TL");
        }
    }
}
