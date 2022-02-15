package Week5.Session20.SetDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
//        s1.add(null);

        System.out.println("Tree Set 1 : ");
        for(Integer i : s1) {
            System.out.println(i);
        }

        TreeSet<Integer> s2 = new TreeSet<>();

        s2.add(10);
        s2.add(9);
        s2.add(8);
        s2.add(7);
//        s2.add(null);
        s2.add(6);
        s2.add(6);

        System.out.println("Tree Set 2 : ");
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

        System.out.println("Ceiling value :: "+s2.ceiling(5));
        System.out.println("First Element :: "+s2.pollFirst());
        System.out.println("Last Element :: "+s2.pollLast());




    }
}

/* CONCLUSIONS :
   1) Null value      ==> NOT ALLOWED
   2)Duplicate values ==> NOT ALLOWED
   3) Order           ==> ASCENDING ORDER

* */

/* OUTPUT

Tree Set 1 :
1
2
3
4
5

Tree Set 2 :
6
7
8
9
10

After addAll(s2) on s1
1
2
3
4
5
6
7
8
9
10

Size of Set is :: 10
Does Set contains 3 :: true
Does Set Contains given set :: true
Is Set empty :: false
Is set s1 equal to s2 :: false
After remove Operation does Set contains 3 :: false
Intersection Operation :: [6, 7, 8, 9, 10]
Difference between two sets :: []

Ceiling value :: 6
First Element :: 6
Last Element :: 10


* */

