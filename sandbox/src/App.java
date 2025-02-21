import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // one();
        // two();
        // three();
        // four();//reverse string
        //five(); // fibonacci
    }

    public static void five() {
        // 1 1 2 3 5 8 13 19 32
        // n + n+1 = n+2
        // n+2 =
        int n = 1;
        int n1 = 1;
        int n2 = 0;
        for (int i = 0; n2 < 1000; i++) {
            n2 = n + n1;// 2
            n = n1;
            n1 = n2;
            System.out.println(n2);
        }
    }

    public static void four() {
        String isim;
        int sesli = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("isim: ");
        isim = scan.next();

        for (int i = 0; i < isim.length(); i++) {
            char c = isim.charAt(i);
            if (c == 'a' || c == 'e' || c == 'o' || c == 'ı' || c == 'o' || c == 'u' || c == 'i') {
                sesli++;
                System.out.println(String.format("%s: seslidir ", c));
            }
        }
        System.out.println("sesli harf sayısı " + sesli);
        System.out.println("sessiz harf sayısı a" + (isim.length() - sesli));

    }

    public static void three() {
        String isim;
        Scanner scan = new Scanner(System.in);
        isim = scan.nextLine();
        for (int i = isim.length() - 1; i >= 0; i--) {
            // System.out.print(isim.charAt(i));
        }
    }

    public static void two() {
        Integer sum = 0;
        for (Integer a = 0; a <= 5; a++) {
            sum += a;
        }
        System.out.println(sum);
    }

    public static void one() {
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
