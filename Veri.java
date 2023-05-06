package Giris;

import java.util.Scanner;

public class Veri
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String AdSoyad;
        int yas;
        int maas;

        System.out.print("Adınız ve Soyadınızı Giriniz: ");
        AdSoyad = input.nextLine();

        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.print("Maaşınızı Giriniz: ");
        maas = input.nextInt();

        // Çıktılar
        System.out.println("Adınız: " + AdSoyad);
        System.out.println("Yaşınız: " + yas);
        System.out.println("Maaşınız: " + maas);



    }
}
