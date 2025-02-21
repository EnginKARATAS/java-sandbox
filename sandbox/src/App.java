import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sayi1, sayi2, toplam;
        float ortalama;
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Sayı : ");
        sayi1 = scan.nextInt();
        sayi2 = scan.nextInt();
        toplam = sayi1 + sayi2;
        ortalama = (float) toplam / 2;
        System.out.println("toplam: " + toplam);
        System.out.println("ortalama: " + ortalama);
    }
}
