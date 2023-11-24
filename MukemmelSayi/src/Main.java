import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isMukemmelSayi(sayi)) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }

        scanner.close();
    }

    public static boolean isMukemmelSayi(int sayi) {
        if (sayi<=0){
            return false;
        }
        int toplam=0;
        for (int i=1;i<=sayi/2;i++){
            if (sayi%i==0){
                toplam +=i;
            }

        }
        return toplam ==sayi;
    }
}
