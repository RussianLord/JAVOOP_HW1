public class Auto {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    private String brand, model, color, city;
    private double power, price;
    private int year, averagePower;
    int speed;
    private boolean startStop;

    public Auto(String brand, String model, String color, String city, double power, double price, int year, int speed, int averagePower, boolean startStop) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.city = city;
        this.power = power;
        this.price = price;
        this.year = year;
        this.speed = speed;
        this.startStop = startStop;
        this.averagePower = (int) (power + speed) / 2;
    }

    String getBrand() {
        return brand;
    }

    int getAveragePower() {
        return averagePower;
    }

    String getModel() {
        return model;
    }

    String getColor() {
        return color;
    }

    double getPower() {
        return power;
    }

    double getPrice() {
        return price;
    }

    int getYear() {
        return year;
    }

    int getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAveragePower(int averagePower) {
        this.averagePower = averagePower;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStartStop() {
        return startStop;
    }

    public void setStartStop(boolean startStop) {
        this.startStop = startStop;
    }

    String getCity() {
        return city;
    }


    public void getInfo() {
        System.out.println("Автомобиль: " + brand + " " + model + ". Год выпуска: " + year
                + ". Объём двигателя: " + power + ". Максимальная скорость: " + speed
                + ". Производительность: " + averagePower + ". Цвет кузова: " + color + ". Цена: " + price);
    }

    public void start() {
        startStop = true;
        System.out.println("Автомобиль " + brand + " " + model + " заведён...");
    }

    public void store(){
        path("Магазин");
    }

    public void stop() {
        startStop = false;
        System.out.println("Автомобиль " + brand + " " + model + " заглушен...");
    }

    public void path(String city) {
        if (startStop) System.out.println("Автомобиль " + brand + " " + model + " едет по маршруту: " + city + "...");
        else System.out.println("Автомобиль " + brand + " " + model + " стоит на парковке...");
    }

    public static void comparison(Auto car1, Auto car2) {
        System.out.println("Марка: " + ANSI_GREEN + car1.getBrand() + ANSI_RESET + " --- " + ANSI_RED + car2.getBrand() + ANSI_RESET);
        System.out.println("Модель: " + ANSI_GREEN + car1.getModel() + ANSI_RESET + " --- " + ANSI_RED + car2.getModel() + ANSI_RESET);
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
