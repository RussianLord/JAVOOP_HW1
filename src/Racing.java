import java.util.*;
import java.util.concurrent.TimeUnit;

public class Racing {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    static void autosport(Auto car1, Auto car2, Auto car3, Auto car4, Track map) {

        System.out.println("Добро пожаловать на автогонки RTX-Life!!!\n");
        delay(2);
        System.out.println("Сегодня в заезде учавствуют: " + car1.getModel() + " / " + car2.getModel() + " / "
                + car3.getModel() + " / " + car4.getModel());
        delay(2);
        Map<Integer, String> racers = new HashMap<>();
        racers.put(1, car1.getBrand() + " " + car1.getModel());
        racers.put(2, car2.getBrand() + " " + car2.getModel());
        racers.put(3, car3.getBrand() + " " + car3.getModel());
        racers.put(4, car4.getBrand() + " " + car4.getModel());

        race(car1, car2, car3, car4, map);


    }

    static void race(Auto car1, Auto car2, Auto car3, Auto car4, Track map) {
        Random random = new Random();
        int minSpeed = 50;
        int maxSpeed = 250;
        int carSpeed = random.nextInt(maxSpeed - minSpeed) + minSpeed;
        Map<String, Integer> racer = new HashMap<>();
        String winner = "";
        for (int i = 1; i <= map.getLap(); i++) {
            carSpeed = random.nextInt(maxSpeed - minSpeed) + minSpeed;
            car1.speed = carSpeed;
            racer.put(car1.getBrand() + " " + car1.getModel(), car1.speed);
            carSpeed = random.nextInt(maxSpeed - minSpeed) + minSpeed;
            car2.speed = carSpeed;
            racer.put(car2.getBrand() + " " + car2.getModel(), car2.speed);
            carSpeed = random.nextInt(maxSpeed - minSpeed) + minSpeed;
            car3.speed = carSpeed;
            racer.put(car3.getBrand() + " " + car3.getModel(), car3.speed);
            carSpeed = random.nextInt(maxSpeed - minSpeed) + minSpeed;
            car4.speed = carSpeed;
            racer.put(car4.getBrand() + " " + car4.getModel(), car4.speed);
            System.out.println("\n---=== КРУГ " + i + " ===---\n");
            System.out.println(racer);
            for (Map.Entry<String, Integer> it : racer.entrySet()) {
                int max = Collections.max(racer.values());
                if (max == it.getValue()) {
                    winner = it.getKey();
                    System.out.println("\nАвтомобиль: " + ANSI_GREEN + it.getKey() + ANSI_RESET + " на первой позиции со скоростью: " + ANSI_RED + max + ANSI_RESET);
                }
            }
            delay(3);
        }
        System.out.println("\nПОБЕДИТЕЛЬ " + ANSI_GREEN + winner + ANSI_RESET);
    }

    static void delay(int timer) {
        try {
            TimeUnit.SECONDS.sleep(timer);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}
