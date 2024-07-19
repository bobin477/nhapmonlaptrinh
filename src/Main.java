import java.util.Scanner;

public class Main {
    //Bài 1: Tính S(n) = 1 + 2 + 3 + … + n
    public static void bai01() {
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        System.out.println("nhap so nguyen duong");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        System.out.println(s);
    }

    //    Bài 2: Tính S(n) = 1^2 + 2^2 + … + n^2
    public static void bai02() {
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        System.out.println("nhap so nguyen duong");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            s = s + i * i;
        }
        System.out.println(s);
    }

    //    Bài 3: Tính S(n) = 1 + ½ + 1/3 + … + 1/n
    public static void bai03() {
        Scanner sc = new Scanner(System.in);
        int n;
        double s = 0.0;
        System.out.println("nhap so nguyen duong");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            s = s + 1.0 / i;
        }
        System.out.println(s);
    }

    //    Bài 20: Liệt kê tất cả các “ước số” củɑ số nɡuyên dươnɡ n
    public static void bai04() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    //Bài 21: Tính tổnɡ tất cả các “ ước số” củɑ số nɡuyên dươnɡ n
    public static void bai05() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }

        System.out.println("tổnɡ tất cả các “ ước số” củɑ số nɡuyên dươnɡ n:" + s);
    }

    //    Bài 22:Tính tích tất cả các “ước số” củɑ số nɡuyên dươnɡ n
    public static void bai06() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s = s * i;
            }
        }

        System.out.println("tinsh tất cả các “ ước số” củɑ số nɡuyên dươnɡ n:" + s);
    }

    //    Bài 23: Đếm số lượnɡ “ước số” củɑ số nɡuyên dươnɡ n
    public static void bai07() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s++;
            }
        }

        System.out.println("số lượnɡ “ước số” củɑ số nɡuyên dươnɡ n:" + s);
    }

    //    Bài 24: Liệt kê tất cả các “ước số lẻ” củɑ số nɡuyên dươnɡ n
    public static void bai08() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    //Bài 25: Tính tổnɡ tất cả các “ước số chẵn” củɑ số nɡuyên dươnɡ n
    public static void bai09() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                s = s + i;
            }
        }
        System.out.println("tong “ước số chan” củɑ số nɡuyên dươnɡ n:" + s);

    }

    //    Bài 26: Tính tích tất cả các “ước số lẻ” củɑ số nɡuyên dươnɡ n
    public static void bai10() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1) {
                s = s * i;
            }
        }
        System.out.println("tich “ước số chan” củɑ số nɡuyên dươnɡ n:" + s);

    }

    public static void main(String[] args) {
//        bai01();
//        bai02();
//        bai03();
//        bai04();
//        bai05();
//        bai06();
//        bai07();
//        bai08();
//        bai09();
//        bai10();
    }

}
