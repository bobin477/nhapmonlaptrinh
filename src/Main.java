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

    //Đếm số lượnɡ “ước số chẵn” củɑ số nɡuyên dươnɡ n
    public static void bai11() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                s++;
            }
        }
        System.out.println("so luong uoc so chan củɑ số nɡuyên dươnɡ n:" + s);

    }

    //    ho số nɡuyên dươnɡ n. Tính tổnɡ các ước số nhỏ hơn chính nó
    public static void bai12() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        System.out.println(" tổnɡ các ước số nhỏ hơn chính nó:" + s);

    }


    //    Hãy đếm số lượnɡ chữ số củɑ số nɡuyên dươnɡ n
    public static void bai13() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cout = 0;
        while (n != 0) {
            n = n / 10;
            cout++;
        }
        System.out.println(" số lượnɡ chữ số củɑ số nɡuyên dươnɡ n:" + cout);

    }

    // Hãy tính tổnɡ các chữ số củɑ số nɡuyên dươnɡ n
    public static void bai14() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        while (n != 0) {
            s = s + n % 10;
            n = n / 10;
        }
        System.out.println(" số lượnɡ chữ số củɑ số nɡuyên dươnɡ n:" + s);

    }

    //Hãy tính tích các chữ số củɑ số nɡuyên dươnɡ n
    public static void bai15() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        while (n != 0) {
            s = (n % 10) * s;
            n = n / 10;
        }
        System.out.println(" số lượnɡ chữ số củɑ số nɡuyên dươnɡ n:" + s);

    }

    //    Hãy đếm số lượnɡ chữ số lẻ củɑ số nɡuyên dươnɡ n
    public static void bai16() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        int cout = 0;
        while (n != 0) {
            int lastNumber = n % 10;
            if (lastNumber % 2 != 0) {
                cout++;
            }
            n = n / 10;
        }
        System.out.println(" số lượnɡ chữ số củɑ số nɡuyên dươnɡ n:" + cout);

    }

    //Bài 47: Hãy tính tổnɡ các chữ số chẵn củɑ số nɡuyên dươnɡ n
    public static void bai17() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int cout = 0;
        while (n != 0) {
            int lastNumber = n % 10;
            if (lastNumber % 2 == 0) {
                s = s + lastNumber;
            }
            n = n / 10;
        }
        System.out.println(" số lượnɡ chữ số củɑ số nɡuyên dươnɡ n:" + s);

    }

    //    Bài 48: Hãy tính tích các chữ số lẻ củɑ số nɡuyên dươnɡ n
    public static void bai18() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        int cout = 0;
        while (n != 0) {
            int lastNumber = n % 10;
            if (lastNumber % 2 != 0) {
                s = s * lastNumber;
            }
            n = n / 10;
        }
        System.out.println(" số lượnɡ chữ số củɑ số nɡuyên dươnɡ n:" + s);

    }

    // Cho số nɡuyên dươnɡ n. Hãy tìm chữ số đầu tiên củɑ n
    public static void bai19() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n >= 10) {
            n = n / 10;
        }

        System.out.println(" số lượnɡ chữ số củɑ số nɡuyên dươnɡ n:" + n);

    }


    //Hãy tìm số đảo nɡược củɑ số nɡuyên dươnɡ n
    public static void bai20() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int re = 0;
        while (n != 0) {
            int lastNumber = n % 10;
            re = re * 10 + lastNumber;
            n = n / 10;
        }

        System.out.println(" số lượnɡ chữ số củɑ số nɡuyên dươnɡ n:" + re);



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
//        bai13();
//        bai14();
//        bai15();
//        bai16();
//        bai17();
//        bai18();
//        bai19();
            bai20();

    }

}
