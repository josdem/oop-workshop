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

  public void printAnimal(String name){
    System.out.println(
        "A " + name + " says " + this.getGreeting()
        + ", is " + (this.getIsCarnivorous() ? "" : "not ")
        + "carnivorous, and is " + (this.getIsMammal() ? "" : "not ") + "a mammal."
        );
  }

}
