/**
 * JASMIN, Ramon Emmiel P.
 * 30 November 2023
 *
 * SAMPLE RUN:
 *
 * {2374421=(Lord,18), 1175645516=(Kathleen,17)}
 * {2140939337=(Gracie,20), 2374421=(Lord,18), 1175645516=(Kathleen,17)}
 *
 * 2140939337=(Gracie,20)
 * ,2374421=(Lord,18)
 * ,1175645516=(Kathleen,17)
 *
 * 2140939337
 * ,2374421
 * ,1175645516
 *
 * (Gracie,20)
 * ,(Lord,18)
 * ,(Kathleen,17)
 *
 * Enter a name to search:
 * Kathleen
 * (Kathleen,17)
 */

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class HashTableSampleA implements Runnable{
    public static void main(String[] args) {
        try {
            HashTableSampleA program = new HashTableSampleA();
            Thread thread = new Thread(program);
            thread.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * The print method accepts an iterator parameter then uses this Iterator object to iterate through the data structure used.
     * @param iterator
     */
    public static void print(Iterator iterator){
        if (iterator.hasNext()){
            System.out.println(iterator.next());
            while (iterator.hasNext()){
                System.out.println("," + iterator.next());
            }
        }
    }

    /**
     * The run method showcases different methods that you can do in a Hashtable object
     * You can put an entry (In this case a hash code of the name, and a person).
     * The run method also displays the search functionality just by using built-in methods for the Hashtable.
     */
    public void run(){

        Scanner keyboard = new Scanner(System.in);

        Hashtable<Integer, Person> hashTable1 = new Hashtable<Integer,Person>(4);
        hashTable1.put("Lord".hashCode(), new Person("Lord",18));
        hashTable1.put("Kathleen".hashCode(), new Person("Kathleen", 17));

        System.out.println(hashTable1);

        hashTable1.put("Gracie".hashCode(), new Person("Gracie", 20));

        System.out.println(hashTable1);

        System.out.println();
        print(hashTable1.entrySet().iterator());
        System.out.println();
        print(hashTable1.keySet().iterator());
        System.out.println();
        print((Iterator) hashTable1.elements());
        System.out.println();

        System.out.println("Enter a name to search: ");
        String searchKey = keyboard.nextLine();

        System.out.println(hashTable1.get(searchKey.hashCode()));
    }
}
