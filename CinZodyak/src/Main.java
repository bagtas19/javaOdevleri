import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        System.out.print("Doğum Yılınızı Giriniz: ");
        String[] cinZodyagi = {
                "Maymun", "Horoz", "Köpek", "Domuz",
                "Fare", "Öküz", "Kaplan", "Tavşan",
                "Ejderha", "Yılan", "At", "Koyun"
        };
        int yil = input.nextInt();
        int indeks = yil % 12;

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi[indeks]);


    }
}