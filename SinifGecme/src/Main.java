import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int mat,fizik,turkce,kimya,muzik;
        System.out.println("Matematik notunuz:");
        mat= input.nextInt();
        System.out.println("Fizik notunuz:");
        fizik= input.nextInt();
        System.out.println("Turkce notunuz:");
        turkce= input.nextInt();
        System.out.println("Kimya notunuz:");
        kimya= input.nextInt();
        System.out.println("Muzik notunuz:");
        muzik= input.nextInt();

        double avarage=(mat+turkce+fizik+muzik+kimya)/5.0;
        if (avarage>55)
            System.out.println("Tebrikler gectiniz");
        else
            System.out.println("Kaldınız basarı notunuz:"+avarage);



    }
}