package Giris;

import java.util.Scanner;

public class hesapMakinesi
{
    public static void main(String[] args)
    {
        int islem;
        double sayi1;
        double sayi2;

        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz");
        System.out.print("1 = Toplama\n2 = Çıkartma\n3 = Bölme\n4 = Çarpma\nİslem: ");
        islem = input.nextInt();

        System.out.print("1. Sayıyı Giriniz: ");
        sayi1 = input.nextDouble();

        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = input.nextDouble();

        switch (islem)
        {
            case 1:
                System.out.println("Sonuç" + sayi1 + sayi2);
                break;
            case 2:
                System.out.println("Sonuç = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sonuç = " + (sayi1 / sayi2));
                break;
            case 4:
                System.out.println("Sonuç = " + (sayi1 * sayi2));
                break;
            default:
                System.out.println("Geçersiz İşlem Girdiniz!");
        }
    }
}
