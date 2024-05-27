package com.pluralsight.classes;

import com.pluralsight.interfaces.ICleaner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        ArrayList<Object> things = new ArrayList<>();

        things.add(new Robot("Bolts"));
        things.add(new RobotVacuum("NotASweeper"));
        things.add(new EtchASketch());

        for (Object thing : things) {
            if (thing instanceof ICleaner) {
                ICleaner cleaner = (ICleaner) thing;
                cleaner.clean();
            }
        }*/
/*        EtchASketch potato = new EtchASketch();
        potato.print();*/

        List<String> names;
        names = new ArrayList<>();
        names = new LinkedList<>();
    }
}
