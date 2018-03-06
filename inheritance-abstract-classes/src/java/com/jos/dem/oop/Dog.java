package com.jos.dem.oop;

class Dog extends Animal {

  Dog(){
    super(true, true);
  }

  public String getGreeting(){
    return "barks";
  }

}
