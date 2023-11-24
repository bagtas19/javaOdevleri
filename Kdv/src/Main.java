import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        double tutar,kdvOran=0.18,kdvliTutar,kdvTutar;

        System.out.println("Para degerini giriniz:");

        tutar= input.nextDouble();
        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;

        System.out.println("Kdv'siz Tutar"+tutar);
        System.out.println("Kdv Oranı"+kdvOran);
        System.out.println("Kdv Tutar"+kdvTutar);
        System.out.println("Kdv'li tutar"+kdvliTutar);

    }
}