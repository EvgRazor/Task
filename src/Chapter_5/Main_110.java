package Chapter_5;

import java.util.HashMap;
import java.util.Map;

// Возврат значения по умолчанию из коллекции Мар

public class Main_110 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "127.0.0.1:5432");
        map.put("mysql", "192.168.0.50:3306");
        map.put("cassandra", "192.168.1.5:9042");

        System.out.println(map.get("derby")); // тут будет null. Т.к. нет такого значение.

        System.out.println("-----------------------------------------------------------");

        String xx = map.getOrDefault("derby", "43:45:56:78:90:abc"); // Если такого значение по ключу, то будет значение 43:45:56:78:90:abc
        System.out.println(xx);


    }

}
