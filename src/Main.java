public class Main {
    public static void main(String[] args) {
        // задание 1.
        int age = 18;
        if (age >= 18) {
            System.out.println(" он совершеннолетний ");
        } else {
            System.out.println("он не совершеннолетний ");
        }
        /// задание 2
        int airTemperature = 4;
        if (airTemperature >= 5) {
            System.out.println(" На улице тепло, можно идти без шапки ");
        } else {
            System.out.println(" на улице холодно, " + airTemperature +
                    " гр., нужно одеть шапку");
        }
        /// задание 3
        int speed = 71;
        if (speed <= 60) {
            System.out.println(" Можно ездить спокойно ");
        } else {
            System.out.println(" Если скорость " + speed + ", могут выписать штыф.");
        }
        /// задание 4
        int yearsToMan = 7;
        if (yearsToMan > 2 && yearsToMan < 6) {
            System.out.println(" Если возраст человека равен " + yearsToMan +
                    ", то ему нужно ходить в детский сад.");
        } else {
            System.out.println("Если человеку " + yearsToMan + ", то ему не место в детском саду");
        }
        int yearsToMan2 = 80;
        if (yearsToMan2 > 7 && yearsToMan2 < 17) {
            System.out.println(" Если возраст человека равен " + yearsToMan2 +
                    ", то ему нужно ходить в школу. ");
        } else {
            System.out.println(" Если человеку " + yearsToMan2 + ", то ему не место в школе.");
        }
        int yearsToMan3 = 20;
        if (yearsToMan3 >= 18 && yearsToMan3 <= 24) {
            System.out.println(" Если человеку " + yearsToMan3 + ", то ему место в университете.");
        } else {
            System.out.println(" Если человеку" + yearsToMan3 + ", то ему не место в университете.");
        }
        int yearsToMan4 = 24;
        if (yearsToMan4 >= 24) {
            System.out.println(" Если человеку " + yearsToMan4 + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если человеку " + yearsToMan4 + ", то возможно ему еще рано ходить на работу.");
        }
        /// задание 5
        int childAge = 4;
        if (childAge < 5) ;
        {
            System.out.println(" Если возраст ребенка равен " + childAge + ", " +
                    "то ему нельзя кататься на аттракционе.");
        }
        int childAge2 = 9;
        if (childAge2 > 5 && childAge2 < 14) {
            System.out.println(" Если возраст ребенка " + childAge2 +
                    ", то он может кататься на аттракционе в сопровождение взрослого, " +
                    "если взрослого нет, то нельзя.");
        }
        int childAge3 = 15;
        if (childAge3 > 14) {
            System.out.println(" Если возраст ребенка равен " + childAge3 + ", " +
                    "то он может кататься на аттракционах без сопровождения взрослых.");
        }
        /// задание 6
        int passengers = 77;
        if (passengers < 60) {
            System.out.println(" Есть сидячие места.");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("Есть стоячие места.");
        } else {
            System.out.println("Мест нет");
        }
        /// задание 7
        int one = 5;
        int two = 10;
        int three = 15;
        if (one > two) {
            System.out.println(" наибольшее число one ");
        } else if (two > three) {
            System.out.println(" наибольшее число two");
        } else {
            System.out.println(" наибольшее число three");
        }

    }
}




