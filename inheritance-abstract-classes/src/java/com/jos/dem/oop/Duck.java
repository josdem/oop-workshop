package com.jos.dem.oop;

class Duck extends Animal {

  Duck(){
    super(false, false);
  }

  public String getGreeting(){
    return "quack";
  }

}
