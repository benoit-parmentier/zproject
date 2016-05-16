package com.parmentier.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest {

    List<Person> people =
            Arrays.asList(
                    new Person("Max", 18),
                    new Person("Peter", 23),
                    new Person("Pamela", 23),
                    new Person("David", 12));

    List<Person> persons = people;

    @Test
    public void testCollectors(){
        IntSummaryStatistics ageSummary = persons.stream()
                                            .collect(Collectors.summarizingInt(p -> p.age));
        System.out.println(ageSummary);
    }

    class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}
