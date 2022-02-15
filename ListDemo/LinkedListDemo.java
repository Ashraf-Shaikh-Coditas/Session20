package Week5.Session20.ListDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(null);
        l1.add(5);



        System.out.println("List 1 :: ");
        for(Integer i : l1) {
            System.out.println(i);
        }

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(10);
        l2.add(9);
        l2.add(8);
        l2.add(7);
        l2.add(null);
        l2.add(6);

        System.out.println("List 2 using get() method :: ");
        for(int i=0;i<l2.size();i++) {
            System.out.println(l2.get(i));
        }

        l1.addAll(l2);
        System.out.println("After performing l1.addAll(l2) :: ");
        System.out.println(l1);

        System.out.println("Does l1 contains 3 :: "+l1.contains(3));
        System.out.println("Does l1 contains l2 :: "+l1.containsAll(l2));
        System.out.println("Is l1 empty :: "+l1.isEmpty());

        List<Integer> l3 = l1.subList(3,7);
        System.out.println("SUBLIST :: "+l3);

        System.out.println("Is list l1 equal to l2 :: "+l1.equals(l2));
        System.out.println("First Index of "+l1.indexOf(5));
        System.out.println("Last Index of "+l1.lastIndexOf(5));

        l1.set(3,0);  // sets 3rd index as 0

        l1.retainAll(l2);
        System.out.println("l1 intersection l2 == "+l1);

        l1.remove(5);  // removes value at index 5

        l2.offerFirst(3); // add 3 to start of list .
        l2.offerLast(5); // add 5 at last of list.

        System.out.println("First element in list is :: "+l2.getFirst());
        System.out.println("Last element in list is :: "+l2.getLast());

        System.out.println("Returns head :: "+l2.peek());
        System.out.println("Returns First :: "+l2.peekFirst());
        System.out.println("Returns Last :: "+l2.peekLast());




    }
}

/* CONCLUSIONS :
   1) Null value      ==> ALLOWED
   2)Duplicate values ==> ALLOWED
   3) Order           ==> INSERTION ORDER

* */

/* OUTPUT :

List 1 ::
1
2
3
4
5
null
5

List 2 using get() method ::
10
9
8
7
null
6

After performing l1.addAll(l2) ::
[1, 2, 3, 4, 5, null, 5, 10, 9, 8, 7, null, 6]

Does l1 contains 3 :: true
Does l1 contains l2 :: true
Is l1 empty :: false
SUBLIST :: [4, 5, null, 5]
Is list l1 equal to l2 :: false
First Index of 4
Last Index of 6
l1 intersection l2 == [null, 10, 9, 8, 7, null, 6]
First element in list is :: 3
Last element in list is :: 5
Returns head :: 3
Returns First :: 3
Returns Last :: 5

P

* */
