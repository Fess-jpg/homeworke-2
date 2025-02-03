public class Main {
    public static void main(String[] args) {
        // задание 1.
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println(" Установите версию Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию IOS по ссылке");
        }
        /// задание 2
        int clientDeviceYear = 2014;
        int clientOS2 = 0;
        if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию Android по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию IOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("установите облегченную версию IOS по ссылке");
        }
        ///задание 3
        int year = 2024;
        if (year % 4 == 0 && year > 1584 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        /// задание 4
        int deliveryDistance = 70;
        int deliveryTime = 0;
        if (deliveryDistance > 100) {
            System.out.println("нет доставки");
        } else if (deliveryDistance <= 20) {
            deliveryTime++;
        } else if (deliveryDistance <= 60) {
            deliveryTime += 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime += 3;
        }
        {System.out.println(" Потребуется дней: " + deliveryTime);
        }
        /// задание 5
        char monthNumber = 6;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}











