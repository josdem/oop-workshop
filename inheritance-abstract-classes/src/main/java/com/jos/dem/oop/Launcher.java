package com.jos.dem.oop;

public class Launcher {

  public static void main(String[] args){
    Animal dog = new Dog();
    dog.printAnimal("Dog");

    Animal cow = new Cow();
    cow.printAnimal("Cow");

    Animal duck = new Duck();
    duck.printAnimal("Duck");
  }

}
