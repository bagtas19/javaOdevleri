import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double boy,kg;
        System.out.println("Boyunuzu m cinsinden giriniz");
        boy= input.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz");
        kg= input.nextDouble();

        double vucutKitleIndex=(kg)/(boy*boy);
        System.out.println("Vücüt kitle index:"+vucutKitleIndex);
    }
}