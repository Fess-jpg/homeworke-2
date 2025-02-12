public class Main {
    public static void main(String[] args) {
        System.out.println(" задание 1 ");
        /// task 1
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(" итерация " + i);
        }
        System.out.println(" задание 2 ");
        /// task 2
        for (int y = 10; y >= 1; y = y - 1) {
            System.out.println(" итерация " + y);
        }
        System.out.println(" задание 3 ");
        /// task 3
        for (int x = 2; x < 17; x = x + 2) {
            System.out.println("итерация " + x);
        }
        System.out.println(" задание 4");
        /// task 4
        for (int q = 10; q >= -10; q = q - 1) {
            System.out.println(" итерация " + q);
        }
        System.out.println(" задание 5 ");
        /// task 5
        for (int leanYear = 1904; leanYear <= 2096; leanYear = leanYear + 4) {
            System.out.println(leanYear + "год является високосным");
        }
        System.out.println("задание 6 ");
        /// task 6
        for (int a = 7; a <= 98; a = a + 7) {
            System.out.println("итерация" + a);
        }
        System.out.println("задача 7");
        /// task 7
        for (int s = 1; s <= 512; s = s * 2) {
            System.out.println("итерация" + s);
        }
        System.out.println(" задача 8");
        /// task 8
        int salary = 29000;
        int total = 0;
        for (int z = 1; z <= 12; z++) {
            total = total + salary;
            System.out.println(" в месяц " + z + ", сумма накоплений ровна " + total);
        }
        System.out.println("задание 9");
        /// task 9
        int salary1 = 29000;
        int total1 = 0;
        for (int z = 1; z <= 12; z++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println(" в месяц " + z + ", сумма накоплений ровна " + total1);
        }
        System.out.println("задание 10");
        /// task 10
        int nam = 2;
        for (int r = 1; r <= 10; r++){
            System.out.println(nam + "*" + r + "=" + nam * r);}
    }
}





















