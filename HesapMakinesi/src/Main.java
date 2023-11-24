import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int s1,s2,select;
        System.out.println("İlk sayısı girin");
        s1= input.nextInt();
        System.out.println("İkinci sayısı girin");
        s2= input.nextInt();

        System.out.println("1-Toplama\n2-Cıkarma\n3-Carpman\n4-Bölme");
        System.out.println("Secımınızı girin: ");
        select=input.nextInt();

        if (select==1){
            System.out.println("toplam:"+s1+s2);
        } else if (select==2) {
            System.out.println("Cıkarma:"+(s1-s2));
        } else if (select==3) {
            System.out.println("Carpma:"+(s1*s2));
        } else if (select==4) {
            if (s2 !=0){
                System.out.println("Bolme"+(s1/s2));
            }
            else System.out.println("Bir sayı 0'a bolunemez");
        }else System.out.println("Yanlıs secım yaptınız");



    }
}