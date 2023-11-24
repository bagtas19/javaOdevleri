import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isArmstrongSayi(sayi)) {
            System.out.println(sayi + " bir Armstrong sayıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayı değildir.");
        }

        scanner.close();
    }

    static boolean isArmstrongSayi(int sayi) {
        int toplam = 0;
        int geciciSayi = sayi;
        int basamakSayisi = String.valueOf(sayi).length();

        while (geciciSayi > 0) {
            int basamak = geciciSayi % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            geciciSayi /= 10;
        }

        return toplam == sayi;
    }
}
