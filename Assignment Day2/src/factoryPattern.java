import Sports.Sports;
import arena.arena;

import java.io.*;
public class factoryPattern {
    public static void main(String[] args) {
        arena x = new arena();

        Sports sp1 = x.getSports("Badminton");
        ((Sports) sp1).enter();

        Sports sp2 = x.getSports("Football");
        sp2.enter();
}}