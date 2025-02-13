public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        /// task 1
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_456_000) {
            i = i + 1;
            total = total + salary;
            System.out.println(i + " месяц, сумма накоплений ровна " + total);
        }
        System.out.println(" задание 2");
        /// task 2
        int g = 1;
        while (g <= 10) {
            System.out.print(g + " ");
            g = g + 1;
        }
        System.out.println();
        for (int d = 10; d >= 1; d = d - 1)
            System.out.print(d + " ");
        System.out.println();
        System.out.println(" задание 3 ");
        /// task 3
        int Y = 12_000_000;
        int birth = 17;
        int mortality = 8;
        int on = 1000;
        int year = 1;
        while (year <= 10) {
            Y = (birth - mortality) * on + Y;
            System.out.println(" год " + year + ", численность населения состовляет " + Y);
            year++;
        }
        System.out.println(" задание 4 ");
        /// task 4
        int deposit = 15000;
        int target = 0;
        int month = 1;
        while (target < 12_000_000) {
            target = target + deposit;
            target = target + target / 100 * 7;
            System.out.println(" месяц " + month + ", сумма накоплений " + target);
            month++;
        }
        System.out.println(" задание 5 ");
        /// task 5
        int deposit1 = 15000;
        int target1 = 0;
        int month1 = 0;
        while (target1 < 12_000_000) {
            target1 = target1 + deposit1;
            target1 = target1 + target1 / 100 * 7;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println(" месяц " + month1 + ", сумма накоплений " + target1);
            }
        }
        System.out.println(" задание 6 ");
        /// task 6
        int moon = 0;
        int sum = 15000;
        int common = 0;
        while (moon < 108) {
            common = common + sum;
            common = common + common / 100 * 7;
            moon++;
            if (moon % 6 == 0) ;
            System.out.println(" на " + moon + " месяц сумма накопления ровна " + common);
        }
        System.out.println(" задание 7");
        /// task 7
        int date = 1;
        while (date < 31) {
            date++;
            if (date % 7 == 0)
                System.out.println(" сегодня число " + date + ", пятница, необходимо подготовить отчет");
        }
        System.out.println(" задание 8 ");
        /// task 8
        int yearsEarlier = 2025 - 200;
        int yearsLater = 2025 + 100;
        int years = 0;
        for (years = yearsEarlier; years < yearsLater; years++) {
            if (years % 79 == 0)
                System.out.println(years);
        }
    }
}





















