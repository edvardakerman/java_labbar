class Bird extends Animal {
    Bird(String name, int birthyear) {
      super(name, birthyear);   // Animals konstruktor anropas
    }
  
    void introduceYourself()
    {
      System.out.println("Pip Pip! Jag är en fågel vid namn " + getName() + ".");
      System.out.println("Jag är " + getAge() + " år gammal.");
    }
  
    String makeSound() {
        return "Pip pip!";
    }
  
    void fly() {
        System.out.println("Flax flax, jag flaxar med vingarna!");
    }
  
  }
