package com.esum.commandEx;

public class Client {
    public static void main(String args[]){
        Alarm alarm = new Alarm();
        Button button = new Button(alarm);
        button.pressed();
    }
}