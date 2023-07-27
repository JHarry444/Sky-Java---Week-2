package com.qa.maps;

import com.qa.garage.vehicles.Bike;
import com.qa.garage.vehicles.Car;
import com.qa.garage.vehicles.Lorry;
import com.qa.garage.vehicles.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        Map<String, Vehicle> map = new HashMap();

        map.put("aaaaaaaaaaa", new Car(4, 20));
        map.put("bbb", new Bike(2, false));
        map.put("abcde", new Lorry(8, false));
        System.out.println(map.get("bbb"));
        map.put("bbb", null);

        System.out.println(map);

        System.out.println(Map.of("a", new Car(), "b", new Bike(), "c", new Lorry()));

        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + map.get(key));
        }

        for (Map.Entry<String, Vehicle> entry: map.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        System.out.println("== " + (new Car(4, 20) == new Car(4, 20)));
        System.out.println("equals() " + new Car(4, 20).equals(new Car(4, 20)));

        Map<Vehicle, String> reversed = new HashMap<>();
        reversed.put(new Car(4, 20), "car");
        reversed.put(new Bike(4, false), "bike");
        reversed.put(new Car(4, 20), "honda");

        System.out.println("Reversed: " + reversed);
    }
}
