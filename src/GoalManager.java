import java.util.Scanner;

public class GoalManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入目标
        System.out.print("Enter your goal: ");
        int goal = scanner.nextInt();

        // 输入实际成绩
        System.out.print("Enter your actual amount: ");
        int actual = scanner.nextInt();

        // 判断结果
        boolean overGoal = actual > goal;
        boolean notMetGoal = actual < goal;
        boolean metGoal = actual == goal;

        System.out.println("Went over goal? " + overGoal);
        System.out.println("Did not meet goal? " + notMetGoal);
        System.out.println("Met goal exactly? " + metGoal);

        scanner.close();
    }
}

