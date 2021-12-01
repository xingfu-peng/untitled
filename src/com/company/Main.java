package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

            LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
            map.put(1,"999");
            map.put(2,"999");
            map.put(3,"999");
            map.put(4,"123");
            map.put(5,"123");
            map.put(6,"333");
            LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
            for (Map.Entry<Integer,String> entry: map.entrySet()
            ) {
                if (map1.containsValue(entry.getValue())){
                    map1.values().remove(entry.getValue());
                    map1.put(entry.getKey(),entry.getValue());
                }else {
                    map1.put(entry.getKey(),entry.getValue());
                }
            }
            System.out.println(map1);
        }

}
