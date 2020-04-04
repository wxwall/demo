package com.ctrip.demo.demo.java8.CompletableFuture;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.*;
/**
 * @Author xiaowei.wu
 * @Date 2019/11/29 11:27
 */
public class CompletableFutureApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        completedFutureExample();
        runAsyncExample();
        supplyAsync();
        supplyAsync2();
    }


    static void completedFutureExample() {
        CompletableFuture cf = CompletableFuture.completedFuture("message");
        assertTrue(cf.isDone());
        assertEquals("message", cf.getNow(null));
    }


    static void runAsyncExample() {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() ->{
            return Thread.currentThread().getName();
        });
        System.out.println("主线程继续 " + Thread.currentThread().getName());

        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    static void supplyAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() ->{
            return 100;
        });
        CompletableFuture<Integer> future = cf.whenComplete((k, v) -> {
            System.out.println("k " + k + " V " + v);
        });
        System.out.println(future.get());


    }


    static void supplyAsync2() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() ->{
            return 100;
        });
        CompletableFuture<String> stringCompletableFuture = cf.thenApply(i -> i + 1).thenApply(s -> String.valueOf(s));
        System.out.println(""+ stringCompletableFuture.get());
        stringCompletableFuture.thenAccept(System.out::println);

    }
}
