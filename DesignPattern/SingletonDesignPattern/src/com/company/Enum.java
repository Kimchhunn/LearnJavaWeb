package com.company;

public enum Enum {
    INSTANCE;
    String objName;
    public void setObjName(String name){
        this.objName = name;
    }
    public void printObjName(){
        System.out.println("Enum Object's name is " + objName);
    }
}
