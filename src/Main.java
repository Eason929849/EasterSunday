//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 提示用户输入年份 (整数)
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份 (整数)：");
        int y = scanner.nextInt();

        // 2. 按 Gauss 复活节算法计算
        int a = y % 19;           // Step 2
        int b = y / 100;          // Step 3
        int c = y % 100;          // Step 3
        int d = b / 4;            // Step 4
        int e = b % 4;            // Step 4
        int g = (8 * b + 13) / 25;               // Step 5
        int h = (19 * a + b - d - g + 15) % 30;  // Step 6
        int j = c / 4;            // Step 7
        int k = c % 4;            // Step 7
        int m = (a + 11 * h) / 319;              // Step 8
        int r = (2 * e + 2 * j - k - h + m + 32) % 7; // Step 9
        int n = (h - m + r + 90) / 25;           // Step 10 -> 月份
        int p = (h - m + r + n + 19) % 32;       // Step 11 -> 日期

        // 3. 输出结果（Step 12）
        System.out.println("Easter Sunday falls on: month " + n + " day " + p);

        scanner.close();
    }
}
