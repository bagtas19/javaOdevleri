import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int mesafe,yas,yolculukTipi;
        double mesafeBasıUcret=0.10;

        System.out.println("Kaç kg yol");
        mesafe=input.nextInt();
        System.out.println("Yasınızı giriniz");
        yas=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTipi=input.nextInt();
        double normalTutar = mesafe * (0.10);

        double indirimliTutar=normalTutar;


        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12) {
                indirimliTutar -= normalTutar * 0.50; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                indirimliTutar -= normalTutar * 0.10; // %10 indirim
            } else if (yas >= 65) {
                indirimliTutar -= normalTutar * 0.30; // %30 indirim
            }

            if (yolculukTipi == 2) {
                indirimliTutar -= indirimliTutar * 0.20; // %20 indirim
            }

            System.out.println("Toplam Tutar = " + indirimliTutar + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}