class Butterfly extends Animal {
    Butterfly(String name, int birthyear) {
      super(name, birthyear);   // Animals konstruktor anropas
    }
  
    void introduceYourself()
    {
      System.out.println("Hej, jag är fjärilen " + getName() + ".");
      System.out.println("Jag är " + getAge() + " år gammal.");
    }
  
    String makeSound() {
        return "";
    }
  
    void fly() {
        System.out.println("Flax flax, jag flaxar med vingarna!");
    }
  
  }