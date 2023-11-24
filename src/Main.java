import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int mat,fizik,turkce,tarih,muzik;

        System.out.println("Matematik notu:");
        mat =input.nextInt();

        System.out.println("fizik notu:");
        fizik =input.nextInt();

        System.out.println("turkce notu:");
        turkce =input.nextInt();

        System.out.println("tarih notu:");
        tarih =input.nextInt();

        System.out.println("Müzik notu:");
        muzik =input.nextInt();

        double ortalama=(mat+tarih+turkce+fizik+muzik)/5.0;
        System.out.println("Not ortalamanız:" + ortalama);




    }
}