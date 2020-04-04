package com.ctrip.demo.demo.rxjava;

import rx.Observable;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

import java.util.function.Function;

/**
 * @Author xiaowei.wu
 * @Date 2019/11/29 10:28
 */
public class App {


    static int MAX_I = 200000;

    public static void main(String[] args) {

        hello("小明","小强");

    }


    public static void hello(String... names) {
        Observable.from(names).subscribe( s -> {
            System.out.println(Thread.currentThread().getName() + " hello: " + s);
        });

        long l = System.currentTimeMillis();
        Observable.range(1, MAX_I).map(t -> {
            return Math.sqrt(t);
        }).reduce((i,j)->i+j)
            .subscribeOn(Schedulers.computation())
            .subscribe(s -> {
                System.out.println("Observable直接算" + (System.currentTimeMillis() - l));
            });

    }
}
