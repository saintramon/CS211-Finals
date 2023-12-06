/**
 * JASMIN, Ramon Emmiel P.
 * 6 December 2023
 *
 * SAMPLE RUN:
 * Display entries in Hash Map
 * {Lewis=29, Smith=30, Cook=29, Anderson=31}
 *
 * The age for Lewis is 29
 *
 * Display entries in LinkedHashMap
 * {Smith=30, Anderson=31, Cook=29, Lewis=29}
 */

import java.util.*;

public class TestHashMap implements Runnable{
    public static void main(String[] args) {
        try {
            TestHashMap program = new TestHashMap();
            Thread thread = new Thread(program);
            thread.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void run(){
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in Hash Map");
        System.out.println(hashMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook", 29);

        System.out.println("The age for " + "Lewis is " +
                linkedHashMap.get("Lewis").intValue());
        System.out.println("\nDisplay entries in LinkedHashMap");
        System.out.println(linkedHashMap);
    }
}
