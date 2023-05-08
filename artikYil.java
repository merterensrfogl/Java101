package Giris;

import java.util.Scanner;

public class artikYil
{
    public static void main(String[] args)
    {
        int yil;
        boolean artik;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if (yil % 4 == 0)
        {
            if (yil % 100 == 0)
            {
                artik = yil % 400 == 0;
            }
            else
                artik = true;
        }
        else
            artik = false;

        if (artik == true)
        {
            System.out.println(yil +" Bir Artık Yıldır");
        }
        else
            System.out.print(yil +" Bir artık yıl değildir.");

    }
}
