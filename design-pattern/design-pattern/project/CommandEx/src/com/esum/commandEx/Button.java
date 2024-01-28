package com.esum.commandEx;

public class Button {
    //Lamp lamp;
    private Alarm alarm;
    //알람 기능을 넣기 위해 기존에 
    //램프를 키는 기능을 배제하고 알람기능을 추가함
    public Button(Alarm alarm){this.alarm = alarm;}
    public void pressed(){alarm.start();}
}