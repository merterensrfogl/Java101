package Giris;

import java.util.Scanner;

public class Baslangic
{
    public static void main(String[] args)
    {
        int distance, age, type;
        double total = 0, perKm = 0.10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = inp.nextInt();
        if (type > 2 || type < 1) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            total = (distance * perKm) * type;
            if (age < 12) total *= 0.50;
            else if (age < 24) total *= 0.90;
            else if (age > 65) total *= 0.70;
            if (type == 2) total -= (total * 0.20);
            System.out.printf("Toplam tutar = %f TL%n", total);

        }
    }
}