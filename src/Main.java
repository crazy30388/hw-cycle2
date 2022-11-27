import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Дз циклы 1
        //Задание 1
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        //Задание 2
        for (int a = 10; a >= 0; a--) {
            System.out.println("Итерация цикла " + a);
        }
        //Задание 3
        for (int b = 0; b < 17; b++)
            if (b % 2 == 0) {
                System.out.println("Итерация цикла " + b);
            }
        //Задание 4
        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация цикла " + i);
        }
        //Задание 5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //Задание 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Интерация цикла " + i);
        }
        //Задание 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Интерация цикла " + i);
        }
        //Задание 8
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {

            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
        //Дз циклы 2
        //Задание 1
        int accumulation1 = 15000;
        int total1 = 0;
        int m = 0;
        while (total1 <= 2_459_000) {
            total1 = total1 + accumulation1;
            m++;
        }
        System.out.println("Дз-2, задание 1 \n" + "Месяц " + m + " сумма накоплений равна " + total1 +
                " рублей.");

        //Задание 2
        System.out.println("Дз-2, задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println(" ");
        for (i = 10; i >= 1; ) {
            System.out.print(i-- + " ");
        }
        System.out.println("\n");

        //Задание 3
        System.out.println("Дз-2, задание 3");
        int totalP = 12_000_000;
        int birth = 17;
        int mortality = 8;
        int numbers = birth - mortality;
        for (int b = 1; b <= 10; b++) {
            totalP += totalP * numbers / 1000;
            System.out.println("\nГод " + b + " численность населения составляет " + totalP);
        }
        System.out.println("Дз-2, задание 1, Комбинация цикл-условный оператор");
        int money = 15_000;
        int total3 = 12_000_000;
        int month = 0;
        double precent = 0.07;
        for (; money < total3; month++) {
            money += money * precent;
            System.out.println("За " + month + " месяцев накопил " + money + " рублей");
        }
        System.out.println("Дз-2, задание 2, Комбинация цикл-условный оператор");
        int money2 = 15_000;
        int total4 = 12_000_000;
        int month2 = 0;
        double precent2 = 0.07;
        for (; money2 < total4; month2++) {
            money2 += money2 * precent2;
            if (month2 % 6 == 0) {
                System.out.println("За " + month2 + " месяцев накопил " + money2 + " рублей");
            }


        }
        System.out.println("Дз-2, задание 3, Комбинация цикл-условный оператор");
        int money3 = 15_000;
        int total5 = 12_000_000;
        int month3 = 1;
        double precent3 = 0.07;
        for (; month3 <= 9*12; month3++) {
            money3 += money3 * precent3;
            if (month3 % 6 == 0) {
                System.out.println("За " + month3 + " месяцев накопил " + money3 + " рублей");
            }


        }
        System.out.println("Дз-2, задание 4, Комбинация цикл-условный оператор");
        int firstFriday = 2;
        for (int day = firstFriday; day <= 31; day+=7) {
            System.out.println("Сегодня пятница, готовь отчет \n" + day);
        }
        System.out.println("Дз-3, задание 1, do-whail");
        int year = 0;
        int nowYear = LocalDate.now().getYear();
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int period = 79;
        while (year <= finishYear) {
            if (year >= startYear) {
                System.out.println(year);
            }
            year += period;
        }
        System.out.println("Дз-3, задание 2, do-whail");
        for (int i2 = 2; i2 <= 2; i2++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i2 + " x " + j + " = " + (i2*j));
            }
        }




    }
}