package com.ctrip.demo.demo.java8.predicate;

import com.ctrip.demo.demo.desgin.pipeline.Step;
import com.google.common.collect.Maps;
import com.rabbitmq.client.UnblockedCallback;
import org.apache.commons.collections.Factory;
import org.apache.spark.api.java.function.Function2;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @Author xiaowei.wu
 * @Date 2020/1/21 16:04
 */
public class PredicateTest {

    public static void main(String[] args) {
        PredicateTest predicateTest = new PredicateTest();
        Boolean hello = predicateTest.doTest(s -> s.equals("hello"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<String> isEmpty = String::isEmpty;

        Function<Object, String> objectStringStep = String::valueOf;
        BiPredicate<String, String> stringStringBooleanEntryTransformer = String::startsWith;
        boolean test = stringStringBooleanEntryTransformer.test("123", "123");

        System.out.println(test);
    }


    public Boolean doTest(Predicate<String> predicate){
        return predicate.test("hello");
    }
}
