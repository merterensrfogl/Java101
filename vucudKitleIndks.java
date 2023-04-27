package Giris;

import java.util.Scanner;

public class vucudKitleIndks
{
    public static void main(String[] args)
    {
        double boy;
        double kilo;
        double sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz(Metre Cinsinden): ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        sonuc = kilo / (boy *boy);

        System.out.println("Boyunuz: " + boy);
        System.out.println("Kilonuz: " + kilo);
        System.out.println("Vücut Kitle İndeksiniz: " + sonuc);

    }
}
