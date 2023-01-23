class Butterfly extends Animal {
    Butterfly(String name) {
      super(name);   // Animals konstruktor anropas
    }
  
    void introduceYourself()
    {
      System.out.println("Hej, jag är fjärilen " + name + ".");
    }
  
    String makeSound() {
        return "";
    }
  
    void fly() {
        System.out.println("Flax flax, jag flaxar med vingarna!");
    }
  
  }