package lesson2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main extends OwnList {
    public static void main(String[] args) {
        OwnList ownList = new OwnList();
        int a = 1, b = 2, c = 3, d = 4, f = 5, g = 6, h = 7, i = 8, k = 9, m = 10, x = 11;
        ownList.add(a);
        ownList.add(b);
        ownList.add(c);
        ownList.add(d);
        ownList.add(f);
        ownList.add(g);
        ownList.add(h);
        ownList.add(i);
        ownList.add(k);
        ownList.add(m);

        System.out.println(ownList);
        ownList.add(x,3);
        System.out.println(ownList);

        ownList.add(x,0);
        System.out.println(ownList);

        System.out.println(ownList.get(0));

        System.out.println(ownList.next(20));

        System.out.println(ownList.previous(0));


//        ownList.remove(4);
//        System.out.println(ownList.getPointer());
//        System.out.println(ownList);
//
//        ownList.remove(0);
//        System.out.println(ownList.getPointer());
//        System.out.println(ownList);
//
//        ownList.remove(1);
//        System.out.println(ownList.getPointer());
//        System.out.println(ownList);
//
//        ownList.remove(1);
//        System.out.println(ownList.getPointer());
//        System.out.println(ownList);


    }
}
