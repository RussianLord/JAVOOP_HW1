public class Auto {
    private String brand, model, color, city;
    private double power, price;
    private int year, speed, averagePower;
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
        path(city);
    }

    public void stop() {
        startStop = false;
        System.out.println("Автомобиль " + brand + " " + model + " заглушен...");
        path(city);
    }

    public void path(String city) {
        if (startStop) System.out.println("Автомобиль " + brand + " " + model + " едет по маршруту: " + city + "...");
        else System.out.println("Автомобиль " + brand + " " + model + " стоит на парковке...");
    }

}
