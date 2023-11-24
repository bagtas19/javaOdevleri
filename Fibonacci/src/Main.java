import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("fibonocci eleman sayisini gir");
        int elemanSayisi=input.nextInt();
        System.out.println("Fibonacci serisi:");

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fiboancci(i) + " ");
        }

        input.close();
    }
        static int fiboancci(int n){
        if(n==0)
            return 0;
        else if (n==1) {
            return 1;
        }else
            return fiboancci(n-1)+fiboancci(n-2);
        }
}