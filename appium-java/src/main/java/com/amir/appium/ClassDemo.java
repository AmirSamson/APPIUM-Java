package com.amir.appium;

public class ClassDemo {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.age = 21;
        d1.name = "Toyger";
        d1.sound = "Rawr";
        System.out.println(d1.age);
        System.out.println(d1.name);

        Dog d2 = new Dog();
        d2.name = "Lucy";
        d2.age = 10;
        System.out.println(d2.age);
        System.out.println(d2.name);
    }
    
}

class Dog {
    String name;
    String sound;
    int age;
}