package com.esum.DecoratorEx;

public class LaneDecorator extends DisplayDecorator {

	public LaneDecorator(Display decoratorDisplay) {super(decoratorDisplay);}
    
    @Override
    public void draw(){
        super.draw();
        drawLane();
    }
    private void drawLane() { System.out.println("\t 차선 표시"); }
    
}