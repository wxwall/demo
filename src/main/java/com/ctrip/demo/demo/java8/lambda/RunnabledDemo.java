package com.ctrip.demo.demo.java8.lambda;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;


/**
 * @Author xiaowei.wu
 * @Date 2019/1/7 15:33
 */
public class RunnabledDemo {


    public static void main(String[] args) {
        RunnabledDemo demo = new RunnabledDemo();
        demo.testFunction(System.out::println);
        streamfilter();
        testReduce();
        streamLists();
        random();
        mapStream();
        sortedStream();
        collectStream();
        summaryStream();
        groupbyOrder();


    }

    /**
     * 分组后排序
     */
    private static void groupbyOrder() {
        List<String> strings = Arrays.asList("abc", "abc", "abc", "abc", "bc","bc","bc","bc", "bc", "bc", "efg", "abcd","cd", "jkl", "jkl");
        Map<String, Long> collect = strings.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        System.out.println(collect);
        collect.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> linkedHashMap.put(x.getKey(),x.getValue()));
        System.out.println(linkedHashMap);

        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEachOrdered(x -> linkedHashMap2.put(x.getKey(),x.getValue()));
        System.out.println(linkedHashMap2);
    }

    /**
     * 统计最大，平均
     */
    private static void summaryStream() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(x -> x).summaryStatistics();
        double average = intSummaryStatistics.getAverage();
        int max = intSummaryStatistics.getMax();
        System.out.println(average);
        System.out.println(max);
    }

    /**
     * collectors.joining用法
     */
    private static void collectStream() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        String collect = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
        System.out.println(collect);
    }

    /**
     * 输出4个随机数
     */
    private static void sortedStream() {
        Random random = new Random();
        random.ints().limit(4).sorted().forEach(System.out::println);
    }

    /**
     * map用法
     */
    private static void mapStream() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> collect = numbers.stream().map(i -> i + i).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

        numbers.stream().map(i -> i * 2).forEach(System.out::println);

        List<String> arrs = Arrays.asList("a", "b", "c", "d", "e", "f");
        arrs.stream().map(String::toUpperCase).filter(s -> s.startsWith("A")).forEach(System.out::println);

    }

    /**
     * 输出前10位
     */
    private static void random() {
        Random random = new Random();
        random.ints().limit(10).forEach(s -> System.out.println(s));
    }

    /**
     * filter用法
     */
    private static void streamLists() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> a = strings.stream().filter(str -> str.startsWith("a")).collect(Collectors.toList());
        for (String s : a) {
            System.out.println(s);
        }
    }

    /**
     * count
     */
    private static void streamfilter() {
        List list = Lists.newArrayList("小明","小强","小东","小明");
        long count = list.stream().filter(str -> str.equals("小明")).count();
        System.out.println(count);
    }


    /**
     * 自定义function
     * @param inteface
     */
    public void testFunction(FunctionInteface inteface){
        int i = 10;
        inteface.test(i);
    }


    /**
     * reduce
     */
    public static void testReduce(){
        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4, null, 2, 3);
        //integers.stream().filter(s -> s != null).forEach(System.out::println);
        Integer reduce = integers.stream().filter(s -> s != null).reduce(0,(a,b) -> a - b);

        System.out.println(reduce);


    }
}
