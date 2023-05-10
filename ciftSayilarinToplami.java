package Giris;

import java.util.Scanner;

public class ciftSayilarinToplami
{
    public static void main(String[] args)
    {
        int sayi;
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();
            if (sayi % 4 == 0)
            {
                toplam += sayi;
            }
            else if (sayi == 2)
            {
                toplam += sayi;
            }

        }while (sayi % 2 == 0);

        System.out.print("Girilen sayılardan çift ve 4'e bölünen sayıların toplamı " + toplam);
    }

}
