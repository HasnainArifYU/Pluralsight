package com.pluralsight.classes;

import com.pluralsight.interfaces.ICleaner;
import com.pluralsight.interfaces.IDrawable;

public class EtchASketch implements IDrawable, ICleaner {
    private String drawing;

    public EtchASketch() {
        this.drawing = "";
    }

    public String getDrawing() {
        return drawing;
    }

    @Override
    public void clean() {
        this.drawing = "";
        System.out.println("The Etch A Sketch has been cleaned.");
    }

    @Override
    public void draw() {
        this.drawing += "Drawing...";
        System.out.println("Drawing on the Etch A Sketch.");
    }

    @Override
    public void print() {
        IDrawable.super.print();
        ICleaner.super.print();
    }


}
