import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b;
        double c;
        System.out.println("1.Kenarı gir:");
        a= input.nextInt();
        System.out.println("2.Kenarı gir:");
        b= input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs :" +c);

    }
}