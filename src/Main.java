import java.util.concurrent.TimeUnit;

public class Main {
    /*
    Доработайте программу в свободном стиле.
Можно сравнить 2 автомобиля между собой
Или пусть авто заедет за фруктами :-)
Добавьте несколько произвольных методов и свойств
<br>
ДОП: Сделать гонки:
- задаём растояние
- едут до финиша.
Сказать кто победит.

<br>
Кто не доделал - задания на семинаре:
1)
Напишите класс Car.
В классе должна храниться следующая информация:
название автомобиля - model;
год выпуска - year;
стоимость - price;
цвет - color;
объем двигателя - power.
<br>
2) Доработайте класс Car.
Добавьте в класс Car метод getInfo без параметров, который будет печать на экране значения полей объекта класса model , power и yeare.
<br>
3) Доработайте класс Car.
В классе должна храниться следующая информация:
Свойство - которое говорит заведен авто или нет
Метод - запуска автомобиля
Метод - остановки автомобиля
Метод дороги - при вызове, в качестве аргумента передаем место назначения
И если авто заведён - выводим, что мы на такой-то авто едем место назначения
Если не заведён - сообщить, что авто не заведено. И мы не можем ехать
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        Auto lamborghiniH = new Auto("Lamborghini", "Huracan", "Nature Orange", "Bali"
                , 6.4, 1025.55, 2017, 300, 0, false);
        Auto porche911 = new Auto("Porche", "911 GT", "Speed Gray", "Jakarta"
                , 5.7, 893.74, 2018, 250, 0, false);
        Auto pagani = new Auto("Pagani", "Zonda R", "Cosmic Black", "Hong Kong"
                , 6.2, 1150.43, 2016, 310, 0, false);
        Auto lamborghiniD = new Auto("Lamborghini", "Diablo SV", "Agressive Yellow", "Miami"
                , 4.6, 550.87, 2001, 250, 0, false);

        Track jakarta = new Track("Jakarta",5000, 4);
        Track hongkong = new Track("Hong Kong", 6500, 5);
        Track tokyo = new Track("Tokyo", 4000, 6);

        lamborghiniD.start();
        lamborghiniD.stop();

        pagani.path(pagani.getCity());

        porche911.start();
        porche911.stop();
        porche911.path(porche911.getCity());

        Auto.comparison(pagani,lamborghiniD); // Сравнение автомобилей
        System.out.println(" ");
        Racing.autosport(lamborghiniH,pagani,porche911,lamborghiniD,jakarta); // Гонки, первое место засчитывается по максимальной скорости
    }


}