package com.jos.dem.oop;

public class Launcher {

  public static void main(String[] args){
    Animal dog = new Dog();
    System.out.println(dog.getGreeting("Dog"));

    Animal cow = new Cow();
    System.out.println(cow.getGreeting("Cow"));

    Animal duck = new Duck();
    System.out.println(duck.getGreeting("Duck"));
  }

}
