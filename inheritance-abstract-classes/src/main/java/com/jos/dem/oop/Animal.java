package com.jos.dem.oop;

abstract class Animal {
  boolean isMammal;
  boolean isCarnivorous;

  public Animal(boolean isMammal, boolean isCarnivorous){
    this.isMammal = isMammal;
    this.isCarnivorous = isCarnivorous;
  }

  public boolean getIsMammal(){
    return this.isMammal;
  }

  public boolean getIsCarnivorous(){
    return this.isCarnivorous;
  }

  abstract public String getGreeting();

  public String printAnimal(String name){
    return
        "A " + name + " says " + this.getGreeting()
        + ", is " + (this.getIsCarnivorous() ? "" : "not ")
        + "carnivorous, and is " + (this.getIsMammal() ? "" : "not ") + "a mammal";
  }

}
