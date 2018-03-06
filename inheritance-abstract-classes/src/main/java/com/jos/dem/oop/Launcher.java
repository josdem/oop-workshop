package com.jos.dem.oop;

import org.springframework.stereotype.Component;

@Component
public class Launcher {

  public void start(){
    Animal dog = new Dog();
    System.out.println(dog.printAnimal("Dog"));

    Animal cow = new Cow();
    System.out.println(cow.printAnimal("Cow"));

    Animal duck = new Duck();
    System.out.println(duck.printAnimal("Duck"));
  }

}
