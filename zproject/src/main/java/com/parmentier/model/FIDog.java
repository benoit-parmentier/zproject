package com.parmentier.model;

@FunctionalInterface
public interface FIDog {

    String bark(String string);

    default void moveLeft() {
        System.out.println("move left");
    }
}
