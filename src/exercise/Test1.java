package exercise;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("hello");
        list.add("nihao");
        list.add("lhw");
        list.add(123);
        list.add("$");
        list.add("hello");
        list.add(123);
        System.out.println("List元素个数为："+list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
