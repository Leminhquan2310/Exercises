import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhập số tiền cho vay(vnđ)");
        int loan = inputInt.nextInt();
        System.out.println("Nhập tỉ lệ lãi xuất(%/năm)");
        double percent = inputInt.nextDouble();
        System.out.println("Nhập số tháng cho vay");
        int month = inputInt.nextInt();
        double interest = (double)  loan * (percent / 12)  / 100 * month;
        System.out.printf("Số tiền lãi sau khi hết hạn: %,.0f vnđ", interest);
    }
}
