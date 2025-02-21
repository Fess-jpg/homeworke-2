public class Main {
    public static String checkLeapYear(int year) {
        if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
            return year + " год високосный ";
        } else {
            return year + " год не високосный ";
        }
    }

    ///
    public static void printDownLoadCorrectApp(int clientDeviceYear, int phoneSystem) {
        if (phoneSystem == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println(" Установите версию приложения для IOS по ссылке ");
            } else {
                System.out.println(" Установите облегченную версию приложения для IOS по ссылке ");
            }
        } else if (phoneSystem == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println(" Установите версию приложения для android ");
            } else {
                System.out.println(" Установите облегченную версию проложения для  android ");
            }
        }
    }

    ///
    public static String deliveryDistance(int distance) {
        int deliveryTime = 1;
        int result = 0;
        if (distance <= 0) {
            return " Некоректное растояние ";
        }
        if (distance <= 20) {
            result = deliveryTime;
        } else if (distance <= 60) {
            result = deliveryTime + 1;
        } else if (distance <= 100) {
            result = deliveryTime + 2;
        } else {
            return " доставки нет ";
        }
        {
            return " Потребуется " + result + (result == 1 ? " день " : " дня");
        }
    }

    public static void main(String[] args) {
        System.out.println(" задание 1 ");
        int year = 2024;
        System.out.println(checkLeapYear(year));
        System.out.println(" задание 2 ");
        int phoneSystem = 1;
        int clientDeviceYear = 2014;
        printDownLoadCorrectApp(clientDeviceYear, phoneSystem);
        System.out.println(" задание 3 ");
        int distance = 95;
        System.out.println(deliveryDistance(distance));
    }
}
























