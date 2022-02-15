package Week5.Session20.SetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> s1 = new LinkedHashSet<>();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(null);

        System.out.println("Linked Hash Set 1 : ");
        for(Integer i : s1) {
            System.out.println(i);
        }

        Set<Integer> s2 = new LinkedHashSet<>();

        s2.add(10);
        s2.add(9);
        s2.add(8);
        s2.add(7);
        s2.add(null);
        s2.add(6);

        System.out.println("Linked Hash Set 2 : ");
        for(Integer i : s2) {
            System.out.println(i);
        }

        System.out.println("After addAll(s2) on s1 ");
        s1.addAll(s2);
        for(Integer i : s1) {
            System.out.println(i);
        }

        System.out.println("Size of Set is :: "+s1.size());
        System.out.println("Does Set contains 3 :: "+s1.contains(3));
        System.out.println("Does Set Contains given set :: "+s1.containsAll(s2));
        System.out.println("Is Set empty :: "+s1.isEmpty());
        System.out.println("Is set s1 equal to s2 :: "+s1.equals(s2));
        s1.remove(3); // removes 3
        System.out.println("After remove Operation does Set contains 3 :: "+s1.contains(3));
        s1.retainAll(s2);
        System.out.println("Intersection Operation :: "+s1);
        s1.removeAll(s2);
        System.out.println("Difference between two sets :: "+s1);




    }
}

/* CONCLUSIONS :
   1) Null value      ==> ALLOWED
   2)Duplicate values ==> NOT ALLOWED
   3) Order           ==> INSERTION ORDER

* */

/* OUTPUT

Linked Hash Set 1 :
1
2
3
4
5
null

Linked Hash Set 2 :
10
9
8
7
null
6

After addAll(s2) on s1
1
2
3
4
5
null
10
9
8
7
6

Size of Set is :: 11
Does Set contains 3 :: true
Does Set Contains given set :: true
Is Set empty :: false
Is set s1 equal to s2 :: false
After remove Operation does Set contains 3 :: false
Intersection Operation :: [null, 10, 9, 8, 7, 6]
Difference between two sets :: []



* */

