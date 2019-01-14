package com.ctrip.demo.demo.guava.collections;

import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

/**
 * @Author xiaowei.wu
 * @Date 2019/1/7 11:15
 */
public class GuavaLists {

    public static void main(String[] args) {
        //args = null;
        iters(args);
       // joiner();
       // splitter();
    }

    private static void iters(String[] args) {
        int i = Preconditions.checkElementIndex(2, 3);
        System.out.println(i);
        List<String> strs = Lists.newArrayList("小明","小强","小红");

        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(strs).addValue("小军");

        Map<String,Integer> maps = Maps.newHashMap();

        Iterables.removeIf(strs, str -> str.equals("小明"));
        for (String str : strs) {
            System.out.println(str);
        }
    }

    public static void joiner(){
        Joiner joiner = Joiner.on(",");
        String join = joiner.join("小明", "小强");
        System.out.println(join);
    }

    public static void splitter(){
        System.out.println("splitter.........");
        Iterable<String> split = Splitter.on(",").trimResults().omitEmptyStrings().split("小明,,, ,小强,小东");
        for (String s : split) {
            System.out.println(s);
        }
    }


}
