package com.esum.DecoratorEx;

public class RoadDisplayWithTraffic extends RoadDisplay {
    public void draw(){
        super.draw();
        drawTraffic();
    }
    public void drawTraffic(){System.out.println("교통량 표시");}
}