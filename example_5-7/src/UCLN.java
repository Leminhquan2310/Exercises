import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = inputInt.nextInt();
        System.out.println("Nhập b");
        int b = inputInt.nextInt();
        int result = checkUcln(a, b);
        System.out.println("UCLN của a và b là: " + result);
    }

    static public int checkUcln (int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0){
            return 0;
        }
        while (a != b){
            if(a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
