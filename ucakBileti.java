package Giris;

import java.util.Scanner;

public class ucakBileti
{
    public static void main(String[] args)
    {
        int mesafe;
        int tip;
        int yas;
        double toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.print("Uçuş Tipi Seçiniz\n1 = Tek yön\n2 = Gidiş Dönüş\nSeçiminiz: ");
        tip = input.nextInt();

        toplam = mesafe * 0.10;


        switch (tip)
        {
            case 1:
                if ((mesafe < 0) || (yas < 0))
                {
                    System.out.print("Mesafe veya yol bilgisi negatif olamaz! Lütfen tekrar deneyin");
                    break;
                }
                if (yas < 12)
                {
                    double ind1;
                    ind1 = (toplam / 2);
                    System.out.println("İndirimsiz Tutar " + toplam+"TL");
                    System.out.println("Yaş indirimi %50 "+ ind1+"TL");
                    System.out.println("İndirimli Tutar "+ (toplam - ind1)+"TL");
                    break;
                }
                else if ((yas >= 12) && (yas <= 24))
                {
                    double ind2;
                    ind2 = toplam * 0.10;
                    System.out.println("İndirimsiz Tutar " + toplam+"TL");
                    System.out.println("Yaş indirimi %10 "+ ind2+"TL");
                    System.out.println("İndirimli Tutar "+ (toplam - ind2)+"TL");
                    break;
                }
                else if (yas >= 65)
                {
                    double ind3;
                    ind3 = toplam * 0.10;
                    System.out.println("İndirimsiz Tutar " + toplam+"TL");
                    System.out.println("65 Yaş üstü indirimi %30 "+ ind3+"TL");
                    System.out.println("İndirimli Tutar "+ (toplam - ind3)+"TL");
                    break;
                }
                else
                    System.out.println("Toplam Tutar "+ toplam);
                    break;

            case 2:
            {
                if ((mesafe < 0) || (yas < 0))
                {
                    System.out.print("Mesafe veya yol bilgisi negatif olamaz! Lütfen tekrar deneyin");
                    break;
                }
                if (yas < 12)
                {
                    double ind4;
                    ind4 = (toplam / 2);
                    double avantajIndirim;
                    avantajIndirim = toplam * 0.20;
                    System.out.println("İndirimsiz Tutar " + 2 * toplam+"TL");
                    System.out.println("Yaş indirimi %50 "+ ind4 +"TL");
                    System.out.println("Gidiş Dönüş bilet avantajı %20 indirim" + avantajIndirim);
                    System.out.println("İndirimli Tutar "+ ((toplam * 2) - ind4 - avantajIndirim)  +"TL");
                    break;
                }
                else if ((yas >= 12) && (yas <= 24))
                {
                    double ind5;
                    ind5 = (toplam * 0.10);
                    double avantajIndirim;
                    avantajIndirim = toplam * 0.20;
                    System.out.println("İndirimsiz Tutar " + 2 * toplam+"TL");
                    System.out.println("Yaş indirimi %10 "+ ind5 +"TL");
                    System.out.println("Gidiş Dönüş bilet avantajı %20 indirim " + avantajIndirim +"TL");
                    System.out.println("İndirimli Tutar "+ ((toplam * 2) - ind5 - avantajIndirim)+"TL");
                    break;
                }
                else if (yas >= 65)
                {
                    double ind6;
                    ind6 = (toplam * 0.30);
                    double avantajIndirim;
                    avantajIndirim = toplam * 0.20;
                    System.out.println("İndirimsiz Tutar " + 2 * toplam + "TL");
                    System.out.println("65 yaş üstü indirimi %30 " + ind6 + "TL");
                    System.out.println("Gidiş Dönüş bilet avantajı %20 indirim " + avantajIndirim + "TL");
                    System.out.println("İndirimli Tutar " + ((toplam * 2 ) - ind6 - avantajIndirim) + "TL");
                    break;
                }
                else
                {
                    double avantajIndirim;
                    avantajIndirim = toplam * 0.20;

                    System.out.println("Toplam tutar " + 2 * toplam);
                    System.out.println("Gidiş Dönüş bilet avantaşı %20 indirim " + avantajIndirim + "TL");
                    System.out.println("Toplam Tutar "+ ((toplam * 2) - avantajIndirim) + "TL");
                    break;
                }
            }
            default:
                System.out.print("Hatalı giriş yaptınız tekrar deneyiniz!");
                break;
        }
    }
}
