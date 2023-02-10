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


        lamborghiniD.start();
        lamborghiniD.stop();
        pagani.path(pagani.getCity());

        comparison(pagani, lamborghiniH);
    }

    public static void comparison(Auto car1, Auto car2) {
        System.out.println("Марка: " + car1.getBrand() + " --- " + car2.getBrand());
        System.out.println("Модель: " + car1.getModel() + " --- " + car2.getModel());
        System.out.println("Цвет: " + car1.getColor() + " --- " + car2.getColor());
        System.out.print("Год: " + car1.getYear() + " --- " + car2.getYear());
        if (car1.getYear() > car2.getYear())
            System.out.println(ANSI_GREEN + "  ~~~ " + car1.getBrand() + " " + car1.getModel() + " Более свежая модель" + ANSI_RESET);
        else
            System.out.println(ANSI_RED + "  ~~~ " + car2.getBrand() + " " + car2.getModel() + " Более свежая модель" + ANSI_RESET);
        System.out.print("Мощность л.с.: " + car1.getPower() + " --- " + car2.getPower());
        if (car1.getPower() > car2.getPower())
            System.out.println(ANSI_GREEN + "  ~~~ " + car1.getBrand() + " " + car1.getModel() + " На ~" + (int) (car1.getPower() - car2.getPower()) + "л.с. мощнее." + ANSI_RESET);
        else
            System.out.println(ANSI_RED + "  ~~~ " + car2.getBrand() + " " + car2.getModel() + " На ~" + (int) (car2.getPower() - car1.getPower()) + "л.с. мощнее." + ANSI_RESET);
        System.out.print("Максимальная скорость км/ч: " + car1.getSpeed() + " --- " + car2.getSpeed());
        if (car1.getSpeed() > car2.getSpeed())
            System.out.println(ANSI_GREEN + "  ~~~ " + car1.getBrand() + " " + car1.getModel() + " На " + (car1.getSpeed() - car2.getSpeed()) + "км/ч быстрее." + ANSI_RESET);
        else
            System.out.println(ANSI_RED + "  ~~~ " + car2.getBrand() + " " + car2.getModel() + " На " + (car2.getSpeed() - car1.getSpeed()) + "км/ч быстрее." + ANSI_RESET);
        System.out.print("Производительность: " + car1.getAveragePower() + " --- " + car2.getAveragePower());
        if (car1.getAveragePower() > car2.getAveragePower())
            System.out.println(ANSI_GREEN + "  ~~~ " + car1.getBrand() + " " + car1.getModel() + " На " + (car1.getAveragePower() - car2.getAveragePower()) + " Производительней." + ANSI_RESET);
        else
            System.out.println(ANSI_RED + "  ~~~ " + car2.getBrand() + " " + car2.getModel() + " На " + (car2.getAveragePower() - car1.getAveragePower()) + " Производительней." + ANSI_RESET);
        System.out.print("Цена: " + car1.getPrice() + " --- " + car2.getPrice());
        if (car1.getPrice() < car2.getPrice())
            System.out.println(ANSI_GREEN + "  ~~~ " + car1.getBrand() + " " + car1.getModel() + " На " + (int) (car2.getPrice() - car1.getPrice()) + " кредитов дешевле." + ANSI_RESET);
        else
            System.out.println(ANSI_RED + "  ~~~ " + car2.getBrand() + " " + car2.getModel() + " На " + (int) (car1.getPrice() - car2.getPrice()) + " кредитов дешевле." + ANSI_RESET);
    }
}