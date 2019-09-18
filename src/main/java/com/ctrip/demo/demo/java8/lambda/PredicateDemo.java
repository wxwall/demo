package com.ctrip.demo.demo.java8.lambda;



import com.ctrip.demo.demo.java8.User;
import com.google.common.collect.Lists;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @Author xiaowei.wu
 * @Date 2019/2/18 16:01
 */
public class PredicateDemo {

    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List<Integer> list=new ArrayList<>();
        for(int i:numbers) {
            list.add(i);
        }
        Predicate<Integer> p1=i->i>5;
        Predicate<Integer> p2=i->i<20;
        Predicate<Integer> p3= i->i%2==0;
        List test1=list.stream().filter(p1.and(p2).and(p3)).collect(Collectors.toList());
        List test=list.stream().filter(predicateDate()).collect(Collectors.toList());
        System.out.println(test1.toString());
        System.out.println(test.toString());

        Predicate<Integer> predicate = s -> s>0;
        boolean test2 = predicate.test(1);
        System.out.println(test2);

        Function<Integer,String> function = t -> String.valueOf(t + 1);
        String apply = function.apply(1);
        System.out.println(apply);

        Supplier<String> supplier = () -> new String("aaa");
        String s = supplier.get();
        System.out.println(s);


        Consumer<String> stringConsumer = consumer -> System.out.println(consumer);
        stringConsumer.accept("小明");


        Comparator<Integer> comparator = (comparator1, comparator2) -> comparator1 - comparator2;
        int compare = comparator.compare(2, 1);
        System.out.println(compare);


        Runnable r = () -> System.out.println("你好  " + Thread.currentThread().getName()) ;
        r.run();

        ArrayList<User> strings = Lists.newArrayList(new User(1,1),new User(2,2));
        Map<Integer, List<User>> collect = strings.stream().collect(Collectors.groupingBy(user -> user.getAge()));

        collect.forEach((k,v) -> System.out.println(k + "-" + v));
    }


    public static Predicate<Integer> predicateDate(){
        return integer -> integer > 5;
    }
}
