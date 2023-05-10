package Giris;

import java.util.Scanner;

public class sayilarinOrtalamasi
{
    public static void main(String[] args)
    {
        int sayi;
        int toplam = 0;
        double sayilar = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++)
        {
            if ((i % 3 == 0) && (i % 4 == 0))
            {
                toplam += i;
                sayilar++;
            }
            else if (sayi <= 11)
                System.out.println("11'den küçük sayılarda 3 ve 4'e bölünen sayı yoktur.");
                break;
        }
        ortalama = toplam / sayilar;

        System.out.print(sayi +" Sayısına kadar olan sayılarda 3 ve 4'e bölünen sayıların ortalaması " + ortalama);
    }
}
