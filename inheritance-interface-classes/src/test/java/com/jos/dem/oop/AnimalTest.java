package com.jos.dem.oop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AnimalTest {

  @Test
  public void shouldDogSayHello(){
    Animal dog = new Dog();
    assertEquals("Dog says bark", dog.getGreeting("Dog"));
  }
    
}