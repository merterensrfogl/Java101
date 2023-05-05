package Giris;
import java.util.Scanner;
public class kullaniciGirisi
{
    public static void main(String[] args)
    {
        String kullaniciAdi;
        String sifre;

        
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kullaniciAdi = input.nextLine();
        
        System.out.print("Şifrenizi Giriniz: ");
        sifre = input.nextLine();
        
        if (kullaniciAdi.equals("Java") && sifre.equals("Java101")) {
            System.out.println("Başarıyla Giriş Yapıldı");
        }
        else
        {
            System.out.print("Hatalı Giriş Yaptınız.Şifrenizi Sıfırlamak İster misiniz? 'Yes/No ");
            String control = input.nextLine();
            if (control.equals("No"))
            {
                System.out.print("Şifreniz Değiştirilmedi!");
            }
            else if (control.equals("Yes"))
            {
                short sayac = 0;
                while (sayac < 5)
                {
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    String newSifre = input.nextLine();
                    sayac += 1;
                    if (sayac == 3)
                    {
                        System.out.print("Üst üste çok kez denediniz lütfen daha sonra tekrar deneyin.");
                        break;
                    }
                    if (newSifre.equals("Java101"))
                    {
                        System.out.print("Yeni şifre eski şifre ile aynı olamaz tekrar deneyin!\n");
                    }
                    else if (!(newSifre.equals("Java101")))
                    {
                        System.out.print("Şifreniz Başarıyla Değiştirildi. Yeni Şifreniz " + newSifre);
                        break;
                    }

                }
            }
            else
                System.out.print("Geçersiz Giriş Yaptınız!");
        }

    }
}
