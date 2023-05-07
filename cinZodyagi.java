package Giris;

import java.util.Scanner;

public class cinZodyagi
{
    public static void main(String[] args)
    {
        int yas;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        yas = input.nextInt();

        if (yas % 12 == 0)
            System.out.print("Çin Zodyağı Burcunuz Maymun.");
        else if (yas % 12 == 1)
            System.out.print("Çin Zodyağı Burcunuz Horoz.");
        else if (yas % 12 == 2)
            System.out.print("Çin Zodyağı Burcunuz Köpek.");
        else if (yas % 12 == 3)
            System.out.print("Çin Zodyağı Burcunuz Domuz.");
        else if (yas % 12 == 4)
            System.out.print("Çin Zodyağı Burcunuz Fare.");
        else if (yas % 12 == 5)
            System.out.print("Çin Zodyağı Burcunuz Öküz.");
        else if (yas % 12 == 6)
            System.out.print("Çin Zodyağı Burcunuz Kaplan.");
        else if (yas % 12 == 7)
            System.out.print("Çin Zodyağı Burcunuz Tavşan.");
        else if (yas % 12 == 8)
            System.out.print("Çin Zodyağı Burcunuz Eşderha.");
        else if (yas % 12 == 9)
            System.out.print("Çin Zodyağı Burcunuz Yılan.");
        else if (yas % 12 == 10)
            System.out.print("Çin Zodyağı Burcunuz At.");
        else if (yas % 12 == 11)
            System.out.print("Çin Zodyağı Burcunuz Koyun.");


    }
}
