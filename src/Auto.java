public class Auto {
    private String brand, model, color, city;
    private double power, price;
    private int year, speed;
    private boolean startStop;

    public Auto(String brand,String model, String color,String city, double power, double price, int year, int speed, boolean startStop) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.city = city;
        this.power = power;
        this.price = price;
        this.year = year;
        this.speed = speed;
        this.startStop = startStop;



    }

    String getBrand(){
        return brand;
    }
    String getModel(){
        return model;
    }
    String getColor(){
        return color;
    }
    double getPower(){
        return power;
    }
    double getPrice(){
        return price;
    }
    int getYear(){
        return year;
    }
    int getSpeed(){
        return speed;
    }
    String getCity(){
        return city;
    }


    public void getInfo(){
        System.out.println("Автомобиль: "+brand+" "+model+". Год выпуска: "+year+". Объём двигателя: "+power+". Максимальная скорость: "+speed+
                ". Цвет кузова: "+color+". Цена: "+price);
    }

    public void start(){
        startStop = true;
        System.out.println("Автомобиль " +brand+" "+ model+" заведён...");
    }
    public void stop(){
        startStop = false;
        System.out.println("Автомобиль "+brand+" "+ model+" заглушен...");
    }
    public void path(String city){
        if(startStop) System.out.println("Автомобиль "+brand+" "+ model+" едет по маршруту: "+city+"...");
        else System.out.println("Автомобиль "+brand+" "+ model+" стоит на парковке...");
    }
}