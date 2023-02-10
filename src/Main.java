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
    public static void main(String[] args) {
        Auto lamborghiniH = new Auto("Lamborghini","Huracan","Nature Orange","Bali"
                ,6.4,1025.55,2017, 300, false);
        Auto porche911 = new Auto("Porche","911 GT","Speed Gray","Jakarta"
                , 5.7, 893.74,2018, 250, false);
        Auto pagani = new Auto("Pagani","Zonda R","Cosmic Black","Hong Kong"
                ,6.2,1150.43,2016,310, false);
        Auto lamborghiniD = new Auto("Lamborghini","Diablo SV", "Agressive Yellow","Miami"
                ,4.6, 550.87,2001,250, false);

        lamborghiniD.getInfo();
        lamborghiniH.getInfo();
        pagani.getInfo();
        porche911.getInfo();
        lamborghiniD.start();
        lamborghiniD.path(lamborghiniD.getCity());
        pagani.path(pagani.getCity());




    }
}