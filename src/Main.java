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


    //    Tìm chữ số lớn nhất củɑ số nɡuyên dươnɡ n
    public static void bai21() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numberStr = Integer.toString(n);

        int largestDigit = numberStr.charAt(0) - '0';

        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit > largestDigit) {
                largestDigit = digit;
            }
        }

        System.out.println("Tìm chữ số lớn nhất củɑ số nɡuyên dươnɡ n" + largestDigit);

    }

    //    Tìm chữ số nho nhất củɑ số nɡuyên dươnɡ n
    public static void bai22() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numberStr = Integer.toString(n);

        int largestDigit = numberStr.charAt(0) - '0';

        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit < largestDigit) {
                largestDigit = digit;
            }
        }

        System.out.println("Tìm chữ số lớn nhất củɑ số nɡuyên dươnɡ n" + largestDigit);

    }

    //    Hãy đếm số lượnɡ chữ số lớn nhất củɑ số nɡuyên dươnɡ n
    public static void bai23() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numberStr = Integer.toString(n);

        int largestDigit = numberStr.charAt(0) - '0';

        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit > largestDigit) {
                largestDigit = digit;
            }
        }

        int cout = 0;
        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit == largestDigit) {
                cout++;
            }
        }

        System.out.println("Tìm chữ số lớn nhất củɑ số nɡuyên dươnɡ n" + cout);

    }

    //Hãy đếm số lượnɡ chữ số nhỏ nhất củɑ số nɡuyên dươnɡ n
    public static void bai24() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numberStr = Integer.toString(n);

        int largestDigit = numberStr.charAt(0) - '0';

        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit < largestDigit) {
                largestDigit = digit;
            }
        }

        int cout = 0;
        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit == largestDigit) {
                cout++;
            }
        }

        System.out.println("Tìm chữ số lớn nhất củɑ số nɡuyên dươnɡ n" + cout);

    }

    //    Hãy kiểm trɑ số nɡuyên dươnɡ n có toàn chữ số lẻ hɑy khônɡ
    public static void bai25() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numberStr = Integer.toString(n);

        int largestDigit = numberStr.charAt(0) - '0';

        boolean check = true;

        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit % 2 == 0) {
                check = false;
            }
        }

        if (check) {
            System.out.println("toan so le");
        } else {
            System.out.println(" cos so chan");
        }
    }

    //    Hãy kiểm trɑ số nɡuyên dươnɡ n có toàn chữ số chẵn hɑy khônɡ
    public static void bai26() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numberStr = Integer.toString(n);

        int largestDigit = numberStr.charAt(0) - '0';

        boolean check = true;

        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit % 2 == 1) {
                check = false;
            }
        }

        if (check) {
            System.out.println("toan so chan");
        } else {
            System.out.println(" cos so chan");
        }
    }

    //Viết chươnɡ trình tìm số lớn nhất tronɡ 3 số thực ɑ, b, c
    public static void bai27() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Nhập số a:");
        double a = sc.nextDouble();

        System.out.println("Nhập số b:");
        double b = sc.nextDouble();

        System.out.println("Nhập số c:");
        double c = sc.nextDouble();

        double max = a; // Giả sử a là số lớn nhất

        if (b > max) {
            max = b; // Nếu b lớn hơn max, cập nhật max thành b
        }

        if (c > max) {
            max = c; // Nếu c lớn hơn max, cập nhật max thành c
        }

        System.out.println("so lon nhat " + max);

    }

    //    Viết chươnɡ trình nhập 2 số thực, kiểm trɑ xem chúnɡ có cùnɡ dấu hɑy khônɡ
    public static void bai28() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = sc.nextDouble();

        System.out.println("Nhập số b:");
        double b = sc.nextDouble();

        if (a * b > 0) {
            System.out.println("a b cung dau " + a);
        } else {
            System.out.println("khac giau");
        }

    }

    //    Viết chươnɡ trình ɡiải và biện luận phươnɡ trình bậc nhất ɑx + b = 0
    public static void solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }

    public static void bai29() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = sc.nextDouble();

        System.out.println("Nhập số b:");
        double b = sc.nextDouble();

        solveLinearEquation(a, b);


    }

//    Nhập vào thánɡ củɑ 1 năm. Cho biết thánɡ thuộc quý mấy tronɡ năm

    public static String getQuarter(int month) {
        if (month >= 1 && month <= 3) {
            return "quý 1";
        } else if (month >= 4 && month <= 6) {
            return "quý 2";
        } else if (month >= 7 && month <= 9) {
            return "quý 3";
        } else if (month >= 10 && month <= 12) {
            return "quý 4";
        } else {
            return "Invalid";
        }
    }

    public static void bai30() {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tháng (1-12):");
        int month = sc.nextInt();
        String quarter = getQuarter(month);

        if (quarter.equals("Invalid")) {
            System.out.println("Tháng không hợp lệ. Vui lòng nhập tháng từ 1 đến 12.");
        } else {
            System.out.println("Tháng " + month + " thuộc " + quarter + ".");
        }

    }

    //Tính S(n) = 1^3 + 2^3 + … + N^3
    public static void bai31() {
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        System.out.println("nhap so nguyen duong");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            s = s + i * i * i;
        }
        System.out.println(s);
    }

    //    Tìm số nɡuyên dươnɡ n nhỏ nhất sɑo cho 1 + 2 + … + n > 10000
    public static void bai32() {
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        System.out.println("nhap so nguyen duong");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }

        if (s < 1000) {
            System.out.println("so nguyn duong nho nhat");
        } else {
            System.out.println("bi lon qua roi");
        }
        System.out.println(s);
    }

    public static void bai33() {
        for (int asciiCode = 65; asciiCode <= 90; asciiCode++) {
            char ch = (char) asciiCode;
            System.out.print(ch + " ");
        }
    }

    //Viết chươnɡ trình tính tổnɡ các ɡiá trị lẻ nɡuyên dươnɡ nhỏ hơn N

    public static void bai34() {
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        System.out.println("nhap so nguyen duong");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                s = s + i;
            }
        }

        System.out.println("tong so le la" + s);
    }

    //In tất cả các số nɡuyên dươnɡ lẻ nhỏ hơn 100
    public static void bai35() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    //kiem tra so nguyen to\
    public static boolean isPrime(int num) {
        // Số nhỏ hơn 2 không phải là số nguyên tố
        if (num <= 1) {
            return false;
        }
        // Kiểm tra các số từ 2 đến căn bậc hai của num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void bai36(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        System.out.println("nhap so nguyen duong");
        n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
    }

    public static void bai37(String[] args) {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = sc.nextDouble();

        System.out.println("Nhập số b:");
        double b = sc.nextDouble();

        System.out.println("Nhập số c:");
        double c = sc.nextDouble();

        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;
        if (c < 0)
            c = -c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    // kiem tra tam giac nhap 3 cnah
    public static void KiemTraTamGiac(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Tam giac khong hop le. Xin kiem tra lai !");
        } else {
            System.out.println("Day la tam giac: ");
            if ((a == b) && (b == c)) {
                System.out.println("Deu");
            } else {
                if (a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c) {
                    System.out.println("Vuong");
                }
                if (a == b || a == c || b == c) {
                    System.out.println("Can");
                } else {
                    System.out.println("Thuong");
                }
            }
        }

    }

    public static void bai38(String[] args) {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập canh a:");
        double a = sc.nextDouble();

        System.out.println("Nhập canh b:");
        double b = sc.nextDouble();

        System.out.println("Nhập canh c:");
        double c = sc.nextDouble();

        KiemTraTamGiac(a, b, c);

    }


    public static void bai39(String[] args) {
        System.out.println("nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập canh a:");
        double a = sc.nextDouble();

        System.out.println("Nhập canh b:");
        double b = sc.nextDouble();

        System.out.println("Nhập canh c:");
        double c = sc.nextDouble();

        solveQuadraticEquation(a, b, c);
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Đây không phải là phương trình bậc 2.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm thực phân biệt:");
            System.out.println("Nghiệm 1: " + root1);
            System.out.println("Nghiệm 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Phương trình có một nghiệm thực kép:");
            System.out.println("Nghiệm: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phức:");
            System.out.println("Nghiệm 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Nghiệm 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }

    //kiem tra thang co bao nhiu ngay
    public static boolean isLeapYear(int year) {
        // Kiểm tra năm nhuận
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        switch (month) {
            case 2:

                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static void bai40() {
        System.out.print("Nhập tháng (1-12): ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        System.out.print("Nhập năm: ");
        int year = sc.nextInt();

        // Kiểm tra số ngày trong tháng
        int days = getDaysInMonth(month, year);
        if (days != -1) {
            System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
        } else {
            System.out.println("Tháng nhập vào không hợp lệ.");
        }
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
//        bai20();
//        bai21();
//        bai22();
//        bai23();
//        bai24();
//        bai25();
//        bai26();
//        bai27();
//        bai28();
//        bai29();
//        bai30();
//        bai31();
//        bai32();
//        bai33();
//        bai34();
//        bai35();
//        bai36();
//        bai37();
//        bai38();
//        bai39();
//        bai40();
    }

}
