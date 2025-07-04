import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
////        Nhập xuất:
////        1. In ra Hello World
//        System.out.println("Hello World");
////        2. In ra Hello world, Hi Ae
//        System.out.println("Hello World, Hi ae");
////        3. Nhập vào tên bạn, ví dụ NA => in ra ""Hello C06""
//        System.out.println("Nhập vào tên của bạn");
//        Scanner inputString = new Scanner(System.in);
//        String name = inputString.nextLine();
//        System.out.println("Hello " + name);



////      Kiểu dữ liệu:
////      1. Khai báo 1 biến kiểu int, in ra số đó.
//        int number = 18;
//        System.out.println(number);
////      2. Nhập 1 biến kiểu int, in ra số đó.
//        Scanner inputInt = new Scanner(System.in);
//        System.out.println("Nhập vào tuổi(age)");
//        int age = inputInt.nextInt();
//        System.out.println("Age = " + age);
////      3. Nhập vào 2 biến kiểu int, in ra tổng, tích, hiệu, thương, số dư của 2 số đó.
//        System.out.println("Nhập a");
//        int a = inputInt.nextInt();
//        System.out.println("Nhập b");
//        int b = inputInt.nextInt();
//        System.out.println("Tổng: "+ (a + b));
//        System.out.println("Hiệu: "+ (a - b));
//        System.out.println("Tích: "+ (a * b));
//        double thuong = (double) a / b;
//        System.out.println("Thương: " + thuong);
//        System.out.println("Chia số dư: " + (a % b));
////      4. Nhập vào tên, tuổi. In ra: ""Xin chào ..., tôi năm nay ..."""
//        System.out.println("Nhập tên");
//        String name = inputString.nextLine();
//        System.out.println("Nhập tuổi");
//        int age = inputInt.nextInt();
//        System.out.println("Xin chào " + name + ", tôi năm nay " + age + " tuổi");
//
////      Toán tử:
////      Nhập vào 2 số:
//        Scanner inputInt = new Scanner(System.in);
//        System.out.println("Nhập số a");
//        int a = inputInt.nextInt();
//        System.out.println("Nhập số b");
//        int b = inputInt.nextInt();
////      1. Sử dụng: +, -, *, /, %
//        System.out.println("Tổng: " + (a + b));
//        System.out.println("Hiệu: " + (a - b));
//        System.out.println("Tích: " + (a * b));
//        System.out.println("Thương: " + ((double) a / b));
//        System.out.println("Chia số dư: " + (a % b));
////      2. Sử dụng =, +=, -=, *=, /=
//        a = 20; // =
//        System.out.println("a = 20. result: " + a);
//        a += 5; // +=
//        System.out.println("a += 5. result: " + a);
//        a -= 5; // -=
//        System.out.println("a -= 5. result: " + a);
//        a *= 5; // *=
//        System.out.println("a *= 5. result: " + a);
//        a /= 5; // /=
//        System.out.println("a /= 5. result: " + a);
////      3. Sử dụng ++, --
//        a++; // ++
//        System.out.println("a++. result: " + a);
//        a--; // --
//        System.out.println("a--. result: " + a);
////      4. Sử dụng <, >, <=, >=, ==, !=
//        System.out.println("a < b. result: " + (a < b));
//        System.out.println("a > b. result: " + (a > b));
//        System.out.println("a <= b. result: " + (a <= b));
//        System.out.println("a >= b. result: " + (a >= b));
//        System.out.println("a == b. result: " + (a == b));
//        System.out.println("a != b. result: " + (a != b));
//
////      Điều Kiện:
////      Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
//        Scanner inputInt = new Scanner(System.in);
//        System.out.println("Nhập vào a");
//        int a = inputInt.nextInt();
//        System.out.println("Nhập vào b");
//        int b = inputInt.nextInt();
//        if(a % b == 0){
//            System.out.println("a chia hết cho b");
//        } else {
//            System.out.println("a không chia hết cho b");
//        }
////      Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
//        System.out.println("Nhập vào tuổi");
//        int age = inputInt.nextInt();
//        if (age >= 16 ){
//            System.out.println("Đủ điều kiện vào lớp 10");
//        } else {
//            System.out.println("Không đủ điều kiện vào lớp 10");
//        }
////      Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
//        System.out.println("Nhập vào number");
//        int number = inputInt.nextInt();
//        if (number > 0){
//            System.out.println("number lớn hơn 0");
//        } else {
//            System.out.println("number bé hơn 0");
//        }
////      Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
//        int a, b, c;
//        Scanner inputInt = new Scanner(System.in);
//        System.out.println("Nhập vào số thứ 1");
//        a = inputInt.nextInt();
//        System.out.println("Nhập vào số thứ 2");
//        b = inputInt.nextInt();
//        System.out.println("Nhập vào số thứ 3");
//        c = inputInt.nextInt();
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println("Số lớn nhất là: " + max);
////      Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
//        Scanner inputInt = new Scanner(System.in);
//        double kiemtra, giuaky, cuoiky;
//        System.out.println("Nhập điểm kiểm tra");
//        kiemtra = inputInt.nextFloat();
//        System.out.println("Nhập điểm giữa kỳ");
//        giuaky = inputInt.nextFloat();
//        System.out.println("Nhập điểm cuối kỳ");
//        cuoiky = inputInt.nextFloat();
//        double tongDiem = (kiemtra * 0.2) + (giuaky * 0.3) + (cuoiky * 0.5);
//        System.out.println("Điểm cuối cùng: " + tongDiem);
//        if(tongDiem > 0 && tongDiem < 5){
//            System.out.println("Học lực yếu" );
//        } else if (tongDiem < 6.5) {
//            System.out.println("Học lực trung bình");
//        } else if (tongDiem < 8) {
//            System.out.println("Học lực khá");
//        } else if (tongDiem < 10) {
//            System.out.println("Hoc lực Giỏi");
//        }
////      Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
//        Scanner inputDouble = new Scanner(System.in);
//        System.out.println("Nhập vào tiền doanh thu");
//        double doanhthu = inputDouble.nextDouble();
//        double hoahong = 0;
//        if( doanhthu > 0 && doanhthu < 100000000){
//            hoahong = doanhthu * 0.02;
//        } else if (doanhthu < 200000000){
//            hoahong = doanhthu * 0.03;
//        } else if (doanhthu < 300000000) {
//            hoahong = doanhthu * 0.04;
//        } else if (doanhthu < 400000000){
//            hoahong = doanhthu * 0.05;
//        } else {
//            hoahong = doanhthu * 0.06;
//        }
//        DecimalFormat nf = new DecimalFormat("#,###");
//        System.out.println("Tiền hoa hồng: " + nf.format(hoahong) + "vnđ");
////      Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho
//        System.out.println("Nhập số phút gọi");
//        Scanner inputInt = new Scanner(System.in);
//        int minutes = inputInt.nextInt();
//        int tienCuoc = 25000;
//        if (minutes > 50) {
//            tienCuoc += 50 * 600;
//            tienCuoc += (minutes - 50) * 400;
//        } else {
//            tienCuoc += minutes * 600;
//        }
//        System.out.println("Tổng tiền cước phải trả: " + tienCuoc);
////      Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
//        System.out.println("Nhập vào độ C");
//        Scanner inputInt = new Scanner(System.in);
//        double C = inputInt.nextDouble();
//        double F = C * 9 / 5 + 32;
//        System.out.println(C + " độ C = " + F + " độ F");
////      Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
//        System.out.println("Nhập vào mét");
//        Scanner inputDou = new Scanner(System.in);
//        double met = inputDou.nextDouble();
//        double feet = met * 3.2808;
//        System.out.println(met + " mét = " + feet + " feet");
////      Bài 3: Tính diện tích hình vuông khi biết cạnh a.
//        System.out.println("Nhập vào cạnh a");
//        Scanner inputDou = new Scanner(System.in);
//        double a = inputDou.nextDouble();
//        double acreage = a * a;
//        System.out.println("Diện tích hình vuông cạnh a là: " + acreage);
////      Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
//        Scanner inputDou = new Scanner(System.in);
//        System.out.println("Nhập vào chiều dài");
//        double length = inputDou.nextDouble();
//        System.out.println("Nhập vào chiều rông");
//        double width = inputDou.nextDouble();
//        double acreage = (length + width) * 2;
//        System.out.println("Diện tích hình chữ nhật là: " + acreage);
////      Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
//        Scanner inputDou = new Scanner(System.in);
//        System.out.println("Nhập vào cạnh góc vuông thứ 1");
//        double canh1 = inputDou.nextDouble();
//        System.out.println("Nhập vào cạnh góc vuông thứ 2");
//        double canh2 = inputDou.nextDouble();
//        double acreage = 0.5 * canh1 * canh2;
//        System.out.println("Diện tích tam giác vuông là: " + acreage);
////      Bài 6: Giải phương trình bậc 1.
//        Scanner inputDou = new Scanner(System.in);
//        System.out.println("Nhập cạnh a");
//        double a = inputDou.nextDouble();
//        System.out.println("Nhập cạnh a");
//        double b = inputDou.nextDouble();
//        if(a != 0){
//            System.out.println("Phương trình có 1 nghiệm: x = " + (-b / a));
//        } else {
//            if (b == 0){
//                System.out.println("Phương trình có vô số nghiệm");
//            } else {
//                System.out.println("Phuương trình vô nghiệm");
//            }
//        }
////      Bài 7: Giải phương trình bậc 2.
//        Scanner inputDou = new Scanner(System.in);
//        System.out.println("Nhập vào a");
//        double a = inputDou.nextDouble();
//        System.out.println("Nhập vào b");
//        double b = inputDou.nextDouble();
//        System.out.println("Nhập vào c");
//        double c = inputDou.nextDouble();
//        if (a == 0) {
//            System.out.println("Đây không phải là phương trình bậc 2.");
//        } else {
//            double delta = b * b - 4 * a * c;
//            if(delta > 0){
//                double x1 = (-b + Math.sqrt(delta)) / 2 * a;
//                double x2 = (-b - Math.sqrt(delta)) / 2 * a;
//                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ". x2 = " + x2);
//            } else if (delta == 0){
//                double x = -b / (2 * a);
//                System.out.println("Phương trình có 1 nghiệm kép: x = " + x);
//            } else {
//                System.out.println("Phương trình vô nghiệm");
//            }
//        }
////      Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
//        Scanner inputInt = new Scanner(System.in);
//        System.out.println("Nhập vào tuổi để kiểm tra");
//        int age = inputInt.nextInt();
//        if (age >= 120 || age < 0){
//            System.out.println("Tuổi không hợp lệ");
//        } else {
//            System.out.println("Tuổi hợp lệ");
//        }
////      Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
////      a,b,c > 0
////      a + b > c
////      b + c > a
////      a + c > b
//        Scanner inputInt = new Scanner(System.in);
//        System.out.println("Nhập cạnh a");
//        int a = inputInt.nextInt();
//        System.out.println("Nhập cạnh b");
//        int b = inputInt.nextInt();
//        System.out.println("Nhập cạnh c");
//        int c = inputInt.nextInt();
//        if(a <= 0 && b <= 0 && c <= 0){
//            System.out.println("Không phải là 1 tam giác");
//        } else if (a + b > c && a + c > b && b + c > a){
//            System.out.println("Là một tam giác");
//        } else {
//            System.out.println("Không phải là 1 tam giác");
//        }
////      Bài 10: Viết chương trình tính giá điện.
//        System.out.println("Nhập số kWh điện");
//        Scanner inputInt = new Scanner(System.in);
//        int kWh = inputInt.nextInt();
//        double total = 0;
//        if(kWh > 0 && kWh <= 50){
//            total = kWh * 1.728;
//        } else if (kWh <= 100) {
//            total = (50 * 1.728) + (kWh - 50) * 1.786;
//        } else if (kWh <= 200) {
//            total = (50 * 1.728) + (50 * 1.786) + (kWh - 100) * 2.074;
//        } else if (kWh <= 300) {
//            total =(50 * 1.728) + (50 * 1.786) + (100 * 2.074) + (kWh - 200) * 2.612;
//        } else if (kWh <= 400) {
//            total =(50 * 1.728) + (50 * 1.786) + (100 * 2.074) + (100  * 2.612) + (kWh - 300) * 2.919;
//        } else {
//            total = (50 * 1.728) + (50 * 1.786) + (100 * 2.074) + (100  * 2.612) + (100  * 2.919) + (kWh - 400) * 3.015;
//        }
//        System.out.printf("Tiền điện cho %d kWh là: %,.3f VNĐ\n", kWh, total);
//      Bài 11: Viết chương trình tính thuế thu nhập cá nhân.
        Scanner inputDou = new Scanner(System.in);
        System.out.println("Nhập lương");
        double salary = inputDou.nextDouble();
        System.out.println("Nhập số người phụ thuộc");
        double dependents = inputDou.nextDouble();
        double taxableSalary = salary - (11000000 + 4400000 * dependents);
        double tax = 0;
        if (taxableSalary < 0 ){
            System.out.println("Thuế = 0");
        } else {
            if(taxableSalary < 5000000){
                tax = taxableSalary * 0.05;
            } else if (taxableSalary < 10000000) {
                tax = 250000 + taxableSalary * 0.1;
            } else if (taxableSalary < 18000000) {
                tax = 250000 + 1000000 + taxableSalary * 0.15;
            } else if (taxableSalary < 32000000) {
                tax = 250000 + 1000000 + 1200000 + taxableSalary * 0.2;
            } else if (taxableSalary < 52000000) {
                tax = 250000 + 1000000 + 1200000 + 2800000 + taxableSalary * 0.25;
            } else if (taxableSalary < 80000000) {
                tax = 250000 + 1000000 + 1200000 + 2800000 + 5000000 + taxableSalary * 0.3;
            } else {
                tax = 250000 + 1000000 + 1200000 + 2800000 + 5000000 + 8400000 + taxableSalary * 0.35;
            }
        }
        System.out.println("Tổng thuế: " + tax);
    }
}