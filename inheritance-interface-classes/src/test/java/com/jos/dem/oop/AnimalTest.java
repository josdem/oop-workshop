package com.jos.dem.oop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AnimalTest {

  @Test
  public void shouldDogSaysHello(){
    Animal dog = new Dog();
    assertEquals("Dog says bark", dog.getGreeting("Dog"));
  }

  @Test
  public void shouldCowSaysHello(){
    Animal cow = new Cow();
    assertEquals("Cow says moo", cow.getGreeting("Cow"));
  }
    
}