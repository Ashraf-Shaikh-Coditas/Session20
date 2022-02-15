package Week5.Session20.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> m1 = new HashMap<>();

        m1.put(1,"Ashraf");
        m1.put(2,"Alex");
        m1.put(3,"Sam");
        m1.put(4,"Dave");

        System.out.println("Iterating Map 1 :: ");
        for (Map.Entry<Integer,String> m : m1.entrySet()) {
            System.out.println(m.getKey()+" :: "+m.getValue());
        }

        Map<Integer,String> m2 = new HashMap<>();
        m2.put(7,"Cody");
        m2.put(6,"Chris");
        m2.put(null,null);
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

        m1.replace(1,"Ashraf","ASHRAF");
        System.out.println(m1);

    }
}

/* CONCLUSIONS :
   1) Null value      ==> ALLOWED
   2)Duplicate values ==> KEY NOT ALLOWED , VALUE ALLOWED
   3) Order           ==> UNORDERED

* */

/*

Iterating Map 1 ::
1 :: Ashraf
2 :: Alex
3 :: Sam
4 :: Dave

Iterating Map 2 ::
null :: null
5 :: Dan
6 :: Chris
7 :: Cody

Iterating After m1.putAll(m2) ::
null :: null
1 :: Ashraf
2 :: Alex
3 :: Sam
4 :: Dave
5 :: Dan
6 :: Chris
7 :: Cody

Size of map is :: 8
Is map empty :: false
Does map contains key 1 :: true
Value at key 1 is :: Ashraf
Does map contains value Ashraf :: true
Keys :: [null, 1, 2, 3, 4, 5, 6, 7]
Values :: [null, Ashraf, Alex, Sam, Dave, Dan, Chris, Cody]

{null=null, 1=ASHRAF, 2=Alex, 3=Sam, 4=Dave, 5=Dan, 6=Chris, 7=Cody}




* */
