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

}
