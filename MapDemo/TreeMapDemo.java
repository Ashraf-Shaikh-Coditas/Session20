package Week5.Session20.MapDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> m1 = new TreeMap<>();

        m1.put(1,"Ashraf");
        m1.put(2,"Alex");
        m1.put(3,"Sam");
        m1.put(4,"Dave");

        System.out.println("Iterating Map 1 :: ");
        for (Map.Entry<Integer,String> m : m1.entrySet()) {
            System.out.println(m.getKey()+" :: "+m.getValue());
        }

        Map<Integer,String> m2 = new TreeMap<>();
        m2.put(7,"Cody");
        m2.put(6,"Chris");
//        m2.put(null,null);
        m2.put(5,"Dan");


        System.out.println("Iterating Map 2 :: ");
        for (Map.Entry<Integer,String> m : m2.entrySet()) {
            System.out.println(m.getKey()+" :: "+m.getValue());
        }

        m1.putAll(m2);
        System.out.println("Iterating After m1.putAll(m2) :: ");
        for (Map.Entry<Integer,String> m : m1.entrySet()) {
            System.out.println(m.getKey()+" :: "+m.getValue());
        }

        System.out.println("Size of map is :: "+m1.size());
        System.out.println("Is map empty :: "+m1.isEmpty());
        System.out.println("Does map contains key 1 :: "+m1.containsKey(1));
        System.out.println("Value at key 1 is :: "+m1.get(1));
        System.out.println("Does map contains value Ashraf :: "+m1.containsValue("Ashraf"));
        m1.putIfAbsent(1,"Ash");
        System.out.println("Keys :: "+m1.keySet());
        System.out.println("Values :: "+m1.values());






    }
}

/* CONCLUSIONS :
   1) Null value      ==> NOT ALLOWED
   2)Duplicate values ==> KEY NOT ALLOWED , VALUE ALLOWED
   3) Order           ==> ASCENDING ORDER

* */

/*

Iterating Map 1 ::
1 :: Ashraf
2 :: Alex
3 :: Sam
4 :: Dave

Iterating Map 2 ::
5 :: Dan
6 :: Chris
7 :: Cody

Iterating After m1.putAll(m2) ::
1 :: Ashraf
2 :: Alex
3 :: Sam
4 :: Dave
5 :: Dan
6 :: Chris
7 :: Cody

Size of map is :: 7
Is map empty :: false
Does map contains key 1 :: true
Value at key 1 is :: Ashraf
Does map contains value Ashraf :: true
Keys :: [1, 2, 3, 4, 5, 6, 7]
Values :: [Ashraf, Alex, Sam, Dave, Dan, Chris, Cody]



* */

