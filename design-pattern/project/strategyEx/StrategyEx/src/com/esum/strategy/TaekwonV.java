package com.esum.strategy;

public class TaekwonV extends Robot {
    public TaekwonV(String name) {super(name);}
    public void attack(){
        System.out.println("I have Missile");
    }
    public void move(){
        System.out.println("I can only walk");
    }
}