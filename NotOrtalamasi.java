package Giris;

import java.util.Scanner;

public class NotOrtalamasi
{
    public static void main(String[] args)
    {
        int mat;
        int fizik;
        int kimya;
        int turkce;
        int tarih;
        int muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        int toplam = mat + tarih + muzik + turkce + kimya + fizik;
        int ortalama = toplam / 6;

        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = ortalama >= 60 ? "Sınıfı Geçtiniz :)":"Sınıfta Kaldınız :(";
        System.out.println(sonuc);
    }
}
