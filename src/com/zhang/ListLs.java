package com.zhang;
import com.entity.User;

import java.util.*;

public class ListLs {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("张三", "李四", "王二", "麻子");
        stringList.forEach(System.out::println);
       List list = new ArrayList();
       list.add(new User("张三",12));
       list.add(new User("张四",17));
       list.add(new User("张五",16));
       list.add(new User("张六",15));
       list.add(new User("张七",11));
       /*list.stream().sorted(Comparator.comparing(User::getAge)).collect(.);*/
    }
}
