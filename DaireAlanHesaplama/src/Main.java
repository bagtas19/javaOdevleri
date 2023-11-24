import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        final double  PI=3.14;

        System.out.println("r degerini giriniz:");
        r= input.nextInt();

        double alan,cevre;
        alan=PI*r*r;
        cevre=2*PI*r;
        System.out.println("Alanı:"+alan);
        System.out.println("Cevresi:"+cevre);


    }
}