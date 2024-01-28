package com.esum.DecoratorEx;

public class TrafficDecorator extends DisplayDecorator{
    public TrafficDecorator(Display decoratorDisplay) {super(decoratorDisplay);}
    
    @Override
    public void draw(){
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("\t교통량 표시");
    }

    

}