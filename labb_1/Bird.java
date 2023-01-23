class Bird extends Animal {
    Bird(String name) {
      super(name);   // Animals konstruktor anropas
    }
  
    void introduceYourself()
    {
      System.out.println("Pip Pip! Jag är en fågel vid namn " + name + ".");
    }
  
    String makeSound() {
        return "Pip pip!";
    }
  
    void fly() {
        System.out.println("Flax flax, jag flaxar med vingarna!");
    }
  
  }
