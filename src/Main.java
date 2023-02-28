import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int age = 18;
        if (age == 18 || age > 18) {
            System.out.println("Человеку 18 или больше");
        }
        int ageGood = 21;
        if (age < ageGood) {
            System.out.println("Возраст человека не достиг совершеннолетия, нужно немного подождать");
            System.out.println("task 2");
            int currentTemperature = 4;
            int limitTemperature = 5;
            if (currentTemperature < limitTemperature) {
                System.out.println("На улице " + currentTemperature + "  градусов, нужно надеть шапку");
            } else {
                System.out.println("На улице " + currentTemperature + "  градусов, можно идти без шапки");
            }
        }
    }
}
