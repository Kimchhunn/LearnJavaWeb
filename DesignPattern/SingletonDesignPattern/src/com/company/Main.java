package com.company;

public class Main {

    public void learnNormalSingleton() {
        System.out.println("======== Normal Singleton ========");
        for (int i =1; i < 5; i ++) {

            Normal obj = Normal.getInstance();
            if (obj == null) {
                System.out.println("Object is already created.");
            }
            else {
                System.out.println("Object is created.");
            }
        }
        System.out.println("---------------------------------- \n \n");
    }

    public void learnSingletonThreadSafeWithSyncKeyword() {
        System.out.println("======== Sync Keyword Singleton ========");
        Thread a = new Thread(() -> {
            SyncKeyword obj1 = SyncKeyword.getInstance();
            System.out.println(obj1);
        });
        Thread b = new Thread(() -> {
            SyncKeyword obj2 = SyncKeyword.getInstance();
            System.out.println(obj2);
        });
        a.start();
        b.start();
        System.out.println("---------------------------------- \n \n");
    }

    public void learnSingletonThreadSafeWithSyncCodeBlock () {
        System.out.println("======== Sync Code Block Singleton ========");
        Thread c = new Thread(() -> {
            SyncCodeBlock obj1 = SyncCodeBlock.getInstance();
            System.out.println(obj1);
        });
        Thread d = new Thread(() -> {
            SyncCodeBlock obj2 = SyncCodeBlock.getInstance();
            System.out.println(obj2);
        });
        c.start();
        d.start();
        System.out.println("---------------------------------- \n \n");
    }

    public void learnSingletonThreadSafeWitheEnum () {
        System.out.println("======== Enum Singleton ========");
        Enum enum_obj1 = Enum.INSTANCE;
        Enum enum_obj2 = Enum.INSTANCE;

        enum_obj1.printObjName();
        enum_obj1.setObjName("Chhun");
        enum_obj2.printObjName();  //Output : Chhun

        //Even enum_obj2 is instantiated but it is actually same object as enum_obj1
        enum_obj2.printObjName(); //Output : Chhun
        System.out.println("---------------------------------- \n \n");


    }

    public static void main(String[] args){
        Main main = new Main();
        main.learnNormalSingleton();
        main.learnSingletonThreadSafeWithSyncKeyword();
        main.learnSingletonThreadSafeWithSyncCodeBlock() ;
        main.learnSingletonThreadSafeWitheEnum();
    }
}
