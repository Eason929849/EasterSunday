import java.util.Scanner;

public class RollercoasterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入身高
        System.out.print("Enter your height in cm: ");
        int height = scanner.nextInt();

        // 输入年龄
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // 判断是否满足条件
        if (height >= 140 && age >= 12) {
            System.out.println("You are eligible to ride the rollercoaster!");
        } else {
            System.out.println("Sorry, you are not eligible to ride the rollercoaster.");
        }

        scanner.close();
    }
}

