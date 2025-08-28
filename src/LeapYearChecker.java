import java.util.Scanner;

/*
 Project 2: Leap Year Checker
 规则：
 - 能被 4 整除且不能被 100 整除，为闰年；
 - 但如果能被 400 整除，仍然是闰年。
 输出示例：
 Enter a year: 2024
 2024 is a leap year.
*/

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) 提示用户输入年份
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // 2) 应用闰年规则
        boolean isLeap =
                (year % 4 == 0 && year % 100 != 0)
                        || (year % 400 == 0);

        // 3) 按要求输出
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}

