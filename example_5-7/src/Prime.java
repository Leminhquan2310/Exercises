import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Prime {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhập vào số để kiểm tra");
        int number = inputInt.nextInt();
        if(isPrime(number)){
            System.out.println(number + " là số nguyên tố!");
        } else {
            System.out.println(number + " không phải là số nguyên tố!");
        }
    }

    static public boolean isPrime (int number) {
        if (number < 2) return false;
        for(int i = 2; i < Math.sqrt(number); i++){
          if(number % i == 0){
              return false;
          }
        };
        return true;
    }
}