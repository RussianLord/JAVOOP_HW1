import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Racing {

    static void autosport(Auto car1, Auto car2, Auto car3, Auto car4, Track map) {
        Random ranSpeed = new Random();
        int minSpeed = 50;
        int maxSpeed = 300;
        int speed = ranSpeed.nextInt(maxSpeed-minSpeed)-minSpeed;
        Scanner scan = new Scanner(System.in);

        System.out.println("Добро пожаловать на автогонки RTX-Life!!!\n");
        delay();
        System.out.println("Сегодня в заезде учавствуют: " + car1.getModel() + " / " + car2.getModel() + " / "
                + car3.getModel() + " / " + car4.getModel());
        delay();


        for (int i = 0; i < map.getLap(); i++){
            for (int j = 0; j < map.getLengthTrack(); j++) {


            }
        }

    }
    static void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}
