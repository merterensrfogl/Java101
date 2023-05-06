package Giris;
import java.util.Scanner;
public class buyuktenKucugeSiralama
{
    public static void main(String[] args)
    {
        int s1;
        int s2;
        int s3;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        s1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        s2 = input.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        s3 = input.nextInt();

        if ((s1 > s2) && (s1 > s3))
        {
            if (s2 > s3)
            {
                System.out.print(s1 +">"+ s2 +">"+ s3);
            }
            else
                System.out.print(s1 +">"+ s3 +">"+ s2);
        }
        else if ((s2 > s1) && (s2 > s3))
        {
            if (s1 > s3)
            {
                System.out.print(s2 +">"+ s1 +">"+ s3);
            }
            else
                System.out.print(s2 +">"+ s3+">"+ s1);

        }
        else
        {
            if (s2 > s1)
            {
                System.out.print(s3 +">"+ s2+">"+ s1);
            }
            else
                System.out.print(s3 +">"+ s1+">"+ s2);
        }



    }
}
