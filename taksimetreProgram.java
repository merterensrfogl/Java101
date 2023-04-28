import java.util.Scanner;

public class taksimetreProgram
{
    public static void main(String[] args)
    {
        int km;
        double ucretKm = 2.20;
        double total;
        double acilisUcreti = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz Mesafeyi Giriniz: ");
        km = input.nextInt();

        total = km * ucretKm;
        total += acilisUcreti;

        total = (total < 20) ? 20: total;

        System.out.print("Toplam Ücret: " + total);
    }
}
