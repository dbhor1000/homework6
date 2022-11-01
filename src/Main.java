public class Main {
    public static void main(String[] args) {

        ///Task1

        int i = 0;

        for(i = 0; i <= 10; i++) {

            System.out.println(i);
        }

        ///Task2

        int i2 = 0;

        for(i2 = 10; i2 >= 0; i2--) {

            System.out.println(i2);
        }

        ///Task3

        int it3 = 0;

        for(it3 = 0; it3 <= 17; it3++) {

        if(it3 % 2 == 0){

            System.out.println(it3);

        }

        }

        ///Task4

        int it4 = 0;

        for(it4 = 10; it4 >= -10; it4--) {

            System.out.println(it4);
        }

        ///Task 5

        for(int it5 = 1904; it5 < 2096; it5 = it5 + 4) {

            System.out.println(it5 + "год является високосным.");
        }

        ///Task 6

        for(int it6 = 7; it6 <= 98; it6 = it6 + 7) {

            System.out.println(it6);
        }

        ///Task 7

        for(int it7 = 1; it7 <= 512; it7 = it7 * 2) {

            System.out.println(it7);
        }

        ///Task 8

        int monthly = 29900;

        for(int it8 = 0; it8 <= 12; it8++){

            int amount = monthly * it8;
            System.out.println("Месяц " + it8 + ", сумма накоплений равна " + amount + " рублей.");
        }

        ///Task 9

        double monthly1 = 29900;
        double monthlyRate = (0.01);
        double total = 0;       ///Общая сумма увеличивается от месяца к месяцу
        double rateAdd = 0;

        for(int it9 = 1; it9 <= 12; it9++){

            total = total + monthly1;           ///Делаем вклад в начале месяца
            rateAdd = total * monthlyRate;         ///Выссчитываем процент в конце месяца от суммы вклада
            total = total + rateAdd;        ///Добавляем процент к общей сумме в конце месяца

            System.out.println("Месяц " + it9 + ", сумма накоплений равна " + total + " рублей.");


        }


    }
}