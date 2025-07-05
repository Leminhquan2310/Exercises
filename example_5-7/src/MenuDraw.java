import java.util.Scanner;

public class MenuDraw {
    public static void main(String[] args) {
        int choice = menuChoose();
        while (choice != 0) {
            switch (choice){
                case 1:
                    drawTriangle();
                    break;
                case 2:
                    drawSquare();
                    break;
                case 3:
                    drawRectangle();
                    break;
                default:
                    System.out.println("No choice");
            }
            choice = menuChoose();
        }
    }
    static public int menuChoose() {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        return inputInt.nextInt();
    }

    public static void drawTriangle () {
        System.out.println("     *     ");
        System.out.println("   * * *   ");
        System.out.println(" * * * * * ");
    }

    public static void drawSquare () {
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
    }

    public static void drawRectangle () {
        System.out.println("* * * * * * *");
        System.out.println("* * * * * * *");
        System.out.println("* * * * * * *");
    }
}
