public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    private static void task8() {
        System.out.println("Задача №8");
        int year = 2023;
        int startOfThePeriod = year - 200;
        int endOfThePeriod = year + 100;
        while (startOfThePeriod < endOfThePeriod){
            startOfThePeriod++;
            if (startOfThePeriod % 79 == 0){
                System.out.println(startOfThePeriod);
            }

        }
    }

    private static void task7() {
        System.out.println("Задача №7");
        int friday = 1;
        int dayInMonth = 31;
        int day = 2;
        while (day < dayInMonth) {
            friday++;
            day++;
            if (friday % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }
    }

    private static void task6() {
        System.out.println("Задача №6");
        int totalMonth = 9 * 12;
        int initialDeposit = 15000;
        int countMonth = 0;
        while (countMonth < totalMonth) {
            countMonth++;
            initialDeposit = initialDeposit + initialDeposit * 7 / 100;
            if (countMonth % 6 == 0) {
                System.out.println("Месяц: " + countMonth + " Сумма: " + initialDeposit);
            }
        }
    }

    private static void task5() {
        System.out.println("Задача №5");
        int initialDeposit = 15000;
        int month = 0;
        while (initialDeposit < 12_000_000) {
            month++;
            initialDeposit = initialDeposit + initialDeposit * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + " Сумма: " + initialDeposit);
            }
        }
    }

    private static void task4() {
        System.out.println("Задача №4");
        int initialDeposit = 15000;
        int month = 0;
        while (initialDeposit < 12_000_000) {
            month++;
            initialDeposit = initialDeposit + initialDeposit * 7 / 100;
            System.out.println("Месяц: " + month + " Сумма: " + initialDeposit);

        }
    }

    private static void task3() {
        System.out.println();
        System.out.println("Задача №3");
        int countOfPeople = 12_000_000;
        int populationGrowth = 17 * 1000;
        int populationDeparture = 8 * 1000;
        int year = 0;
        while (year < 10) {
            year++;
            countOfPeople = countOfPeople + (populationGrowth - populationDeparture);
            System.out.println("Год - " + year + " численность населения составляет - " + countOfPeople);
        }
    }

    private static void task2() {
        System.out.println("Задача №2");
        int number1 = 0;
        int number2 = 11;
        while (number1 < 10) {
            number1++;
            System.out.print(number1 + " ");
        }
        System.out.println();
        for (int i = 10; number2 > 1; i--) {
            number2--;
            System.out.print(i + " ");
        }
    }


    private static void task1() {
        System.out.println("Задача №1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month++;
            total = total + salary;
            System.out.println("Месяц - " + month + " сумма накоплений равна " + total + " рублей");
        }
    }
}