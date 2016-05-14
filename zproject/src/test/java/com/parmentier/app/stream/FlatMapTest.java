package com.parmentier.app.stream;

import org.junit.Before;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapTest {

    List<Foo> foos = new ArrayList<>();

    @Before
    public void setup() {
        // create foos
        IntStream
                .range(1, 4)
                .forEach(i -> foos.add(new Foo("Foo" + i)));

        // create bars
        foos.forEach(f ->
                IntStream
                        .range(1, 4)
                        .forEach(i -> f.bars.add(new Bar("Bar" + i + " <- " + f.name))));

    }

    class Foo {
        String name;
        List<Bar> bars = new ArrayList<>();

        Foo(String name) {
            this.name = name;
        }
    }

    class Bar {
        String name;

        Bar(String name) {
            this.name = name;
        }
    }
}
