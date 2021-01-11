package exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDome {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("hello");
        set.add("nihao");
        set.add("lhw");
        set.add(123);
        set.add("$");
        set.add("hello");
        set.add(123);
        set.add(123);
        System.out.println("Set元素个数为："+set.size());
        Iterator iterator=set.iterator();//???
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

    }
}
