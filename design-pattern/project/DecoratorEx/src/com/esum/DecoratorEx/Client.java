package com.esum.DecoratorEx;

public class Client {
    public static void main(String[] args){
       Display road = new RoadDisplay();
       road.draw();
       Display roadWithLane = new LaneDecorator(new RoadDisplay());
       roadWithLane.draw();
       Display roadawaithTraffic = new TrafficDecorator(new RoadDisplay());
       roadawaithTraffic.draw();
    }
}