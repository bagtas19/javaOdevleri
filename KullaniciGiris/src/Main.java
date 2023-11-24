import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String userName,password;
        System.out.println("Kullanıcı Adınız:");
        userName= input.nextLine();
        System.out.println("Parolanız Adınız:");
        password= input.nextLine();

        if (userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş Başarılı");
        }else
            System.out.println("Bilgileriniz Yanlış!!!");

    }
}