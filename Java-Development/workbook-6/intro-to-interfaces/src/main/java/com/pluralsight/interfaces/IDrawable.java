package com.pluralsight.interfaces;

public interface IDrawable {
    void draw();

    default void print() {
        System.out.println("This object can draw things.");
    }
}
