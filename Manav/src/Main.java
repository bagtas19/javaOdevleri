import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;

        System.out.println("Kac kılo armut aldın");
        double armutKg= input.nextDouble();

        System.out.println("Kac kılo elma aldın");
        double elmaKg= input.nextDouble();

        System.out.println("Kac kılo domates aldın");
        double domatesKg= input.nextDouble();

        System.out.println("Kac kılo muz aldın");
        double muzkg= input.nextDouble();

        System.out.println("Kac kılo patlıcan aldın");
        double patlicanKg= input.nextDouble();

        System.out.println("Armut:"+(armutKg*armut));
        System.out.println("Elma:"+(elmaKg*elma));
        System.out.println("Domates:"+(domatesKg*domates));
        System.out.println("Muz:"+(muz*muzkg));
        System.out.println("Patlican:"+(patlican*patlicanKg));

    }
}