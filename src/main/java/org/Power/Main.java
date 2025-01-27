package org.Power;

public class Main {
    public static void main(String[] args) {
        Power power = new Power();
        System.out.println("Hello world!");
        System.out.println(power.naivePower(1,0));
        System.out.println(power.unoptimizedPower(3,3));
        System.out.println(power.optimizedPower(1,3));

        //testing is done in test directory with j-unit
    }

}