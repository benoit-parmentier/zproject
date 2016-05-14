package com.parmentier.app.stream;

import org.junit.Test;

import java.util.stream.Stream;

public class MatchTest {

    @Test
    public void testAllMatchMap(){
        boolean anyMatch = Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .allMatch(s -> {
                    System.out.println("allMatch: " + s);
                    return s.startsWith("A");
                });

        System.out.println("allMatch: " + anyMatch);
    }

    @Test
    public void testAnyMatchMap(){
        boolean anyMatch = Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });

        System.out.println("anyMatch: " + anyMatch);
    }

}
