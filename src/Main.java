import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ///
        System.out.println("task 1");
        int[] expenses = {1100, 2200, 3300, 4400, 5500};
        int sun = 0;
        for (int expense : expenses) {
            sun += expense;
        }
        System.out.println(" сумма трат за месяц составила " + sun + " рублей");
        ///
        System.out.println("task 2");
        int[] spending = {1100, 3300, 2200, 5500, 4400};
        int maxSpending = spending[0];
        for (final int max : spending) {
            if (max > maxSpending) {
                maxSpending = max;
            }
        }
        System.out.println("Максимальная сумма затрат составила " + maxSpending + " рублей.");
        int minSpending = spending[0];
        for (int i = 0; i < spending.length; i++) {
            final int min = spending[i];
            if (min < minSpending) {
                minSpending = min;
            }
        }
        System.out.println("Минимальная сумма затрат составила " + minSpending + " рублей");
        ///
        System.out.println("task 3");
        int[] exes = {2200, 4400, 3300, 1100, 5500};
        int total = 0;
        for (int exps : exes)
            total += exps;
        double middle = total / 5.0;
        System.out.println("Средняя сумма трат за месяц составила "
                + middle + " рублей.");
        ///
        System.out.println("task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}







