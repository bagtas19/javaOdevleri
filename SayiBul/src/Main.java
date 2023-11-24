import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Kaç sayı gireceksin:");
        int n=input.nextInt();

if (n<0){
    System.out.println("Geçerli bir sayi girmediniz");
} else {
    System.out.println("1. sayıyı giriniz: ");
    int sayi= input.nextInt();
    int enBuyuk=sayi;
    int enKucuk=sayi;

    for (int i=2;i<=n;i++){

        System.out.println(i +". Sayiyi girin: ");
        sayi =input.nextInt();

        if (sayi > enBuyuk) {
            enBuyuk = sayi;
        }

        if (sayi < enKucuk) {
            enKucuk = sayi;
        }
    }
    System.out.println("En büyük sayı: " + enBuyuk);
    System.out.println("En küçük sayı: " + enKucuk);
    }
        input.close();

    }
}