import java.util.Scanner;

public class SugarChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入今天已经吃的糖
        System.out.print("How many grams of sugar have you eaten today? ");
        int sugar = scanner.nextInt();

        // 判断是否还能继续吃
        if (sugar < 30) {
            System.out.println("You can eat more sugar: true");
        } else if (sugar == 30) {
            System.out.println("You have reached your limit.");
        } else {
            System.out.println("You have exceeded your limit!");
        }

        scanner.close();
    }
}

