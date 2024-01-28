package com.study.singleton;

import javax.annotation.Resource;

public class Printer {
    public static Printer printer = null;
    public Printer(){}
    private void print(Resource r){}

    public static Printer getPrinter(){
        if(printer == null){
            printer = new Printer();
        }
        return printer;
    }
    public void print(String str){
        System.out.println(str);
    }

}
