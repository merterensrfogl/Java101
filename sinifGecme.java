package Giris;
import java.util.Scanner;
public class sinifGecme
{
    public static void main(String[] args)
    {
        int matematik;
        int fizik;
        int kimya;
        int turkce;
        int muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        int mat = (matematik < 0) || (matematik > 100) ? 0: matematik;

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        int fiz = (fizik < 0) || (fizik > 100) ? 0: fizik;

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        int kim = (kimya < 0) || (kimya > 100) ? 0: kimya;

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        int turk = (turkce < 0) || (turkce > 100) ? 0: turkce;

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        int muz = (muzik < 0) || (muzik > 100) ? 0: muzik;

        int toplam;
        double sonuc;
        toplam = (mat + fiz + kim + turk + muz);
        sonuc = toplam / 5.0;

        if (sonuc >= 55)
        {
            System.out.print("Tebrikler sınıfı geçtiniz Ortlamanız:" + sonuc);
        }
        else
        {
            System.out.print("SInıfta kaldınız. Ortalamanız:" + sonuc);
        }



    }
}
