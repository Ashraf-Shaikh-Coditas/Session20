package Week5.Session20.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
// Iterator traverse only in forward direction.
// List
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(10);

        System.out.println(" Iterator :: ");
        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("List Iterator :: ");
        System.out.println("Forward Direction");
        ListIterator litr = l1.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        System.out.println("Reverse Direction :");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        LinkedList<Integer> l3 = new LinkedList();
        ArrayList<Integer> l4 = new ArrayList<>();



    }
}

/*

Iterator ::
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

List Iterator ::
Forward Direction
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

Reverse Direction :
10
9
8
7
6
5
4
3
2
1


**/
