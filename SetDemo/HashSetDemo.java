package Week5.Session20.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hs1 = new HashSet<>();

        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        hs1.add(null);

        System.out.println("Hash Set 1 : ");
        for(Integer i : hs1) {
            System.out.println(i);
        }

        Set<Integer> hs2 = new HashSet<>();

        hs2.add(10);
        hs2.add(9);
        hs2.add(8);
        hs2.add(7);
        hs2.add(null);
        hs2.add(6);

        System.out.println("Hash Set 2 : ");
        for(Integer i : hs2) {
            System.out.println(i);
        }

        System.out.println("After addAll(hs2) on hs1 ");
        hs1.addAll(hs2);
        for(Integer i : hs1) {
            System.out.println(i);
        }

        System.out.println("Size of Set is :: "+hs1.size());
        System.out.println("Does Set contains 3 :: "+hs1.contains(3));
        System.out.println("Does Set Contains given set :: "+hs1.containsAll(hs2));
        System.out.println("Is Set empty :: "+hs1.isEmpty());
        System.out.println("Is set hs1 equal to hs2 :: "+hs1.equals(hs2));
        hs1.remove(3); // removes 3
        System.out.println("After remove Operation does Set contains 3 :: "+hs1.contains(3));
        hs1.retainAll(hs2);
        System.out.println("Intersection Operation :: "+hs1);
        hs1.removeAll(hs2);
        System.out.println("Difference between two sets :: "+hs1);


    }
}

/* CONCLUSIONS :
   1) Null value      ==> ALLOWED
   2)Duplicate values ==> NOT ALLOWED
   3) Order           ==> UNORDERED

* */

/* OUTPUT

Hash Set 1 :
null
1
2
3
4
5

Hash Set 2 :
null
6
7
8
9
10

After addAll(hs2) on hs1
null
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

Size of Set is :: 11
Does Set contains 3 :: true
Does Set Contains given set :: true
Is Set empty :: false
Is set hs1 equal to hs2 :: false
After remove Operation does Set contains 3 :: false
Intersection Operation :: [null, 6, 7, 8, 9, 10]
Difference between two sets :: []


* */

