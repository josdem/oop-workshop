package com.jos.dem.oop

import spock.lang.Specification

class AnimalSpec extends Specification {

  void "should say hello to the Dog"(){
    given:'A Dog Animal'
      Animal dog = new Dog()
    when:'We say hello'
      String result = dog.printAnimal("Dog")
    then:'We expect formatted hello'
      result == 'A Dog says bark, is carnivorous, and is a mammal'
  }

  void "should say hello to the Cow"(){
    given:'A Cow Animal'
      Animal cow = new Cow()
    when:'We say hello'
      String result = cow.printAnimal("Cow")
    then:'We expect formatted hello'
      result == 'A Cow says moo, is not carnivorous, and is a mammal'
  }

  void "should say hello to the Duck"(){
    given:'A Duck Animal'
      Animal duck = new Duck()
    when:'We say hello'
      String result = duck.printAnimal("Duck")
    then:'We expect formatted hello'
      result == 'A Duck says quack, is not carnivorous, and is not a mammal'
  }

}
