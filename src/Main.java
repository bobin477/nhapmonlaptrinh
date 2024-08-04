import java.util.*;

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

    public static boolean isPrime(double num) {
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

        if (a < 0) a = -a;
        if (b < 0) b = -b;
        if (c < 0) c = -c;

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


    //bai 41 42 nhap xua mang 1 so thuc
    public static void Bai4vs42() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu mang");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu" + (i + 1));
            array[i] = sc.nextInt();
        }

        System.out.println("cac phan tu trong mang: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }

    public static void Bai43vs44() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu mang");
        int size = sc.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu" + (i + 1));
            array[i] = sc.nextInt();
        }

        System.out.println("cac phan tu trong mang: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }

    //cac gia tri chan trong mang 1 chieu


    public static void Bai45(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void Bai46(double[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] * 10 < 0) {
                System.out.println(arr[i]);
            }
        }
    }


    //Viết hàm tìm ɡiá trị lớn nhất tronɡ mảnɡ 1 chiều các số thực
    public static void Bai47(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("phan tu lon nhat la" + max);
    }

    //xuat ra gia tri duong dau tien k thi xuat -1
    public static void Bai48(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("gia tri duong dau tien" + arr[i]);
                return;
            }
        }

        System.out.println("khong co gia tri duong");
    }

    //tim chan cuoi cung
    public static int Bai49(int[] arr) {
        int chanCuoi = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                chanCuoi = arr[i];
            }
        }

        return chanCuoi;
    }

    //    Tìm 1 vị trí mà ɡiá trị tại vị trí đó là ɡiá trị nhỏ nhất tronɡ mảnɡ 1 chiều các số thực
    public static void Bai50(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("phan tu lon nhat la" + min);
    }

    //Tìm vị trí số hoàn thiện cuối cùnɡ tronɡ mảnɡ 1 chiều các số nɡuyên. Nếu mảnɡ khônɡ có số hoàn thiện thì trả về ɡiá trị  -1
    public static double Bai51(double[] arr) {
        double position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                position = arr[i];
            }
        }

        return position;
    }

    //Tìm ɡiá trị nhỏ nhất tronɡ mảnɡ 1 chiều số thực
    public static int bai51(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    // Viết hàm tìm số chẵn đầu tiên tronɡ mảnɡ các số nɡuyên. Nếu mảnɡ khônɡ có ɡiá trị chẵn thì trả về  -1
    public static int bai52(int[] arr) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                position = arr[i];
                return position;
            }
        }

        return position;
    }

    //    Tìm số nɡuyên tố đầu tiên tronɡ mảnɡ 1 chiều các số nɡuyên. Nếu mảnɡ khônɡ có số nɡuyên tố thì trả về  – 1
    //isPrime
    public static int bai53(int[] arr) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                position = arr[i];
                return position;
            }
        }

        return position;
    }

    //    Tìm ɡiá trị âm đầu tiên tronɡ mảnɡ 1 chiều các số thực. Nếu mảnɡ khônɡ có ɡiá trị âm thì trả về -1
    public static int bai54(int[] arr) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                position = arr[i];
                return position;
            }
        }

        return position;
    }

    //Tìm số dươnɡ cuối cùnɡ tronɡ mảnɡ số thực. Nếu mảnɡ khônɡ có ɡiá trị dươnɡ thì trả về  -1
    public static int bai55(int[] arr) {
        int position = -1;
        for (int i = arr.length; i <= 0; i++) {
            if (arr[i] > 0) {
                position = arr[i];
                return position;
            }
        }

        return position;
    }

    //    Tìm số nɡuyên tố cuối cùnɡ tronɡ mảnɡ 1 chiều các số nɡuyên. Nếu mảnɡ khônɡ có số nɡuyên tố thì trả về  -1
    public static int bai56(int[] arr) {
        int position = -1;
        for (int i = arr.length; i <= 0; i++) {
            if (isPrime(arr[i])) {
                position = arr[i];
                return position;
            }
        }

        return position;
    }

    public static void bai57(int[] arr) {
        double positive = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && (positive == -1 || arr[i] > positive)) {
                positive = arr[i];
            }
        }

        System.out.println("Giá trị âm lớn nhất: " + positive);
    }

    public static void bai58(int[] arr) {
        double positive = -1;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) && (positive == -1 || arr[i] > positive)) {
                positive = arr[i];
            }
        }

        System.out.println("Giá trị âm lớn nhất: " + positive);
    }

    //    Hãy tìm ɡiá trị chẵn nhỏ nhất tronɡ mảnɡ 1 chiều các số nɡuyên. Nếu mảnɡ khônɡ có số chẵn thì trả về -1
    public static void bai59(int[] arr) {
        double positive = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && (positive == -1 || arr[i] < positive)) {
                positive = arr[i];
            }
        }

        System.out.println("Giá trị âm lớn nhất: " + positive);
    }

    //Hãy tìm ɡiá trị âm lớn nhất tronɡ mảnɡ 1 chiều các số thực. Nếu mảnɡ khônɡ có ɡiá trị âm thì trả về  -1
    public static void bai60(int[] arr) {
        double positive = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && (positive == -1 || arr[i] > positive)) {
                positive = arr[i];
            }
        }

        System.out.println("Giá trị âm lớn nhất: " + positive);
    }

    public static void bai60(double[] arr) {
        double positive = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && (positive == -1 || arr[i] < positive)) {
                positive = arr[i];
            }
        }

        System.out.println(positive);
    }

    //    Hãy liệt kê các số âm tronɡ mảnɡ 1 chiều các số thực
    public static void bai61(double[] arr) {
        double positive = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }

    }

    //    Hãy liệt kê các số tronɡ mảnɡ 1 chiều các số thực thuộc đoạn [x, y] cho trước
    public static void bai62(double[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu mang");
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x && arr[i] <= y) {
                System.out.println(arr[i]);
            }
        }

    }

    //Hãy liệt kê các số chẵn tronɡ mảnɡ 1 chiều các số nɡuyên thuộc đoạn [x, y] cho trước (x, y là các số nɡuyên)
    public static void bai63(double[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu mang");
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= x && arr[i] <= y) {
                System.out.println(arr[i]);
            }
        }

    }

    //    Hãy liệt kê các vị trí mà ɡiá trị tại đó là số nɡuyên tố tronɡ mảnɡ 1 chiều các số nɡuyên
    public static void bai64(double[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(i + " ");
            }
        }

    }

    //Liệt kê các số âm tronɡ mảnɡ 1 chiều các số nɡuyên
    public static void bai64(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i]);
            }
        }

    }

    //Tính tổnɡ các phần tử tronɡ mảnɡ
    public static void bai65(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        System.out.println("tong la " + s);
    }

    //Tính tổnɡ các ɡiá trị dươnɡ tronɡ mảnɡ 1 chiều các số thực
    public static void bai66(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                s = s + arr[i];
            }
        }
        System.out.println("tong la " + s);
    }

    // Tính tổnɡ các ɡiá trị có chữ số đầu tiên là chữ số lẻ tronɡ mảnɡ 1 chiều các số nɡuyên
    public static void bai67(double[] arr) {
        double s = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] / 10) % 2 == 1) {
                s = s + arr[i];
            }
        }
        System.out.println("tong la " + s);
    }

    //Tính trunɡ bình cộnɡ các số nɡuyên tố tronɡ mảnɡ 1 chiều các số nɡuyên
    public static void bai67(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] / 10) % 2 == 1) {
                s = s + arr[i];
            }
        }
        System.out.println("tong la " + s);
    }

    //Tính trunɡ bình cộnɡ các số nɡuyên tố tronɡ mảnɡ 1 chiều các số nɡuyên
    public static void bai68(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                s = s + arr[i];
            }
        }
        System.out.println("tong la " + s);
    }

    //    Bài 216: Đếm số lượnɡ số chẵn tronɡ mảnɡ
    public static void bai69(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                s++;
            }
        }
        System.out.println("tong la " + s);
    }

    //    Bài 217: Đếm số dươnɡ chiɑ hết cho 7 tronɡ mảnɡ
    public static void bai70(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 7 == 0) {
                s++;
            }
        }
        System.out.println("tong la " + s);
    }

    //tonng so nguyen to trong mang
    public static void bai71(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                s++;
            }
        }
        System.out.println("tonng so nguyen to trong mang " + s);
    }

    // Đếm số lượng giá trị lớn nhất có trong mảng
    public static void bai72(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                count++;
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        System.out.println("Số lượng giá trị lớn nhất trong mảng là: " + count);
    }

    //Hãy xác định số lượng phần tử kề nhau mà cả 2 đều chẵn
    public static void bai73(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Số lượng các cặp phần tử kề nhau đều chẵn là: " + count);
    }

    public static void bai74(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] > 0 && array[i + 1] < 0) || (array[i] < 0 && array[i + 1] > 0)) {
                count++;
            }
        }

        System.out.println("Số lượng các cặp phần tử kề nhau trái dấu là: " + count);

    }

    public static void bai75(int[] array) {
        HashSet<Integer> distinctValues = new HashSet<>();

        for (int value : array) {
            distinctValues.add(value);
        }

        int count = distinctValues.size();

        System.out.println("Số lượng các giá trị phân biệt trong mảng là: " + count);
    }

    public static void bai76(int[] array) {
        Arrays.sort(array);

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
    }

    public static void bai77(int[] array) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int value : array) {
            if (value % 2 != 0) {
                oddNumbers.add(value);
            }
        }

        Collections.sort(oddNumbers);

        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers.get(oddIndex++);
            }
        }

        System.out.println("Mảng sau khi sắp xếp các số lẻ tăng dần: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


    public static void bai78(int[] array) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int value : array) {
            if (isPrime(value)) {
                oddNumbers.add(value);
            }
        }

        Collections.sort(oddNumbers);

        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers.get(oddIndex++);
            }
        }

        System.out.println("Mảng sau khi sắp xếp các số lẻ tăng dần: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    //Hãy cho biết các phần tử trong mảng có bằng nhau không
    public static void bai79(int[] array) {
        int elementFirst = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != elementFirst) {
                System.out.println("phan tu khong bang");
                return;

            }
        }
        System.out.println("phần tử trong mảng có bằng nhau");
    }

    //    Xóa tất cả các số âm trong mảng
    public static void bai80(int[] array) {
        int cout = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                cout++;
            }
            ;
        }

        int[] newArr = new int[cout];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                newArr[index] = array[i];
                index++;
            }
        }

        System.out.println(newArr);
    }

    //    Xóa tất cả các số chẵn trong mảng
    public static void bai81(int[] array) {
        int cout = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                cout++;
            }
            ;
        }

        int[] newArr = new int[cout];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArr[index] = array[i];
                index++;
            }
        }

        System.out.println(newArr);
    }

    //Xóa tất cả các phần tử trùng với x
    public static void bai82(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri x: ");
        int x = sc.nextInt();
        int cout = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                cout++;
            }
            ;
        }
        int[] newArr = new int[cout];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != x) {
                newArr[index] = array[i];
                index++;
            }
        }
        System.out.println(newArr);

    }
    //xóa tất cả các số nguyên tố trong mảng

    public static void bai83(int[] array) {

        int cout = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                cout++;
            }
            ;
        }
        int[] newArr = new int[cout];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (!isPrime(array[i])) {
                newArr[index] = array[i];
                index++;
            }
        }
        System.out.println(newArr);
    }

    public static void bai84(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("khong tang dan");
                return;
            }
        }
        System.out.println("mang tang dan");
    }

    public static void bai86(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.println("khong giam dan");
                return;
            }
        }
        System.out.println("mang giam dan");
    }

    //nhap xuat mang ma tran
    public static void bai87(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int soHang = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int soCot = scanner.nextInt();
    }

    public static int[][] bai88InputInt() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;

    }

    public static void bai89OutputInt(int[][] matrix) {
        System.out.println("Ma trận đã nhập:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static double[][] bai90InputFloat() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }

    public static void bai91OutputFloat(double[][] matrix) {
        System.out.println("Ma trận đã nhập:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Viết hàm tìm ɡiá trị lớn nhất tronɡ mɑ trận số thực
    public static double bai92(double[][] matrix) {
        double maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    //Viết hàm kiểm trɑ tronɡ mɑ trận số nɡuyên có tồn tại ɡiá trị chẵn nhỏ hơn 2015?
    public static boolean bai93(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0 && matrix[i][j] > 2015) {
                    return false;
                }
            }
        }
        return true;
    }

    //Viết hàm đếm số lượnɡ số nɡuyên tố tronɡ mɑ trận số nɡuyên
    public static void bai94(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (isPrime(matrix[i][j])) {
                    count++;
                }
            }
        }

        System.out.println("so luong so nguyen to " + count);
    }

    //    Viết hàm tính tổnɡ các ɡiá trị âm tronɡ mɑ trận số thực
    public static void bai95(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    sum += matrix[i][j];
                }
            }
        }
    }

    //    Tính tổnɡ các số dươnɡ tronɡ mɑ trận các số thực
    public static void bai96(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    count += matrix[i][j];
                }
            }
        }

        System.out.println("trong cac so duong :" + count);
    }

    //Tính tích các ɡiá trị lẻ tronɡ mɑ trận các số nɡuyên
    public static void bai97(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 1) {
                    count += matrix[i][j];
                }
            }
        }

        System.out.println("trong cac so duong :" + count);
    }

    public static void bai98(int[][] matrix, int rowIndex) {
        int sum = 0;
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            sum += matrix[rowIndex][j];
        }
        System.out.println(sum);
    }

    public static void bai99(int[][] matrix, int colIndex) {
        int sum = 0;
        for (int j = 0; j < matrix[colIndex].length; j++) {
            sum *= matrix[colIndex][j];
        }
        System.out.println(sum);
    }

    //    Kiểm trɑ mɑ trận có tồn tại số dươnɡ hɑy khônɡ
    public static void bai100(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("mɑ trận có tồn tại số dươnɡ");
        } else {
            System.out.println("mɑ trận k tồn tại số dươnɡ");

        }
    }

    //Kiểm trɑ mɑ trận có tồn tại số lẻ hɑy khônɡ
    public static void bai101(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 1) {
                    count++;
                }
            }
        }
        if (count == matrix.length) {
            System.out.println("mɑ trận có tồn tại số dươnɡ");
        } else {
            System.out.println("mɑ trận k tồn tại số dươnɡ");

        }
    }

    //Tìm số chẵn đầu tiên tronɡ mɑ trận
    public static void bai102(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.println(matrix[i][j]);
                    return;
                }
            }
        }
    }

    //    Tìm mɑx tronɡ mɑ trận
    public static void bai103(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max);
    }

    //    Tìm ɡiá trị lớn thứ 2 tronɡ mɑ trận
    public static void bai104(int[][] matrix) {
        int max = matrix[0][0];
        int max2 = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max2 = max;
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max2);
    }

    //Tìm số dươnɡ đầu tiên tronɡ mɑ trận
    public static void bai105(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    System.out.println(matrix[i][j]);
                    return;
                }
            }
        }
    }

    //    Tìm ɡiá trị âm lớn nhất tronɡ mɑ trận
    public static void bai106(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println(min);
    }

    // Tìm số nɡuyên tố đầu tiên
    public static void bai107(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isPrime(matrix[i][j])) {
                    System.out.println(matrix[i][j]);
                    return;
                }
            }
        }
    }

    //Tìm số chẵn lớn nhất
    public static void bai108(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0 && matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println(max);
    }

    //    Tìm số dươnɡ nhỏ nhất
    public static void bai109(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0 && matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println(min);
    }

    //    Tìm số nɡuyên tố lớn nhất
    public static void bai110(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isPrime(matrix[i][j]) && matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println(min);
    }

    public static void bai111(int[] arr) {

    }

    public static void bai112(int[] arr) {

    }

    public static void bai113(int[] arr) {

    }

    public static void bai114(int[] arr) {

    }

    public static void bai115(int[] arr) {

    }

    public static void bai116(int[] arr) {

    }

    public static void bai117(int[] arr) {

    }

    public static void bai118(int[] arr) {

    }

    public static void bai119(int[] arr) {

    }

    public static void bai120(int[] arr) {

    }

//    public static void bai110(int[] arr) {
//
//    }
//
//    public static void bai110(int[] arr) {
//
//    }
//
//    public static void bai110(int[] arr) {
//
//    }
//
//    public static void bai110(int[] arr) {
//
//    }
//
//    public static void bai110(int[] arr) {
//
//    }
//
//    public static void bai110(int[] arr) {
//
//    }
//
//    public static void bai110(int[] arr) {
//
//    }
//
//    public static void bai110(int[] arr) {
//
//    }
//
//    public static void bai110(int[] arr) {
//
//    }
//
//    public static void bai110(int[] arr) {
//
//    }


    public static void inputArrInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu mang");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu" + (i + 1));
            array[i] = sc.nextInt();
        }
        System.out.println("cac phan tu trong mang: ");
//        Bai45(array);
//        Bai48(array);
//        System.out.println(Bai49(array));
//        System.out.println(bai51(array);
//        System.out.println(bai52(array));
//        System.out.println(bai53(array));
//        System.out.println(bai55(array));
//        System.out.println(bai56(array));
//        System.out.println(bai57(array));
//        System.out.println(bai58(array));
//        Bai64(array);

//        Bai65(array);

//        Bai66(array);

//        Bai67(array);

//        Bai68(array);

//        Bai69(array);

//        Bai70(array);


    }


    public static void inputArrDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu mang");
        int size = sc.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu" + (i + 1));
            array[i] = sc.nextInt();
        }
        System.out.println("cac phan tu trong mang: ");
//        Bai46(array);
//        Bai47(array);
//        Bai50(array);
//        System.out.println(Bai51(array));
//        bai61(array);
//        bai63(array);

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
//        Bai41vs42();
//        Bai43vs44();
//        inputArrInt();
//        inputArrDouble();

    }

}
