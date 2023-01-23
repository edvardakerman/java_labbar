class Cat extends Animal {
    Cat(String name) {
      super(name);   // Animals konstruktor anropas
    }
  
    void introduceYourself()
    {
      System.out.println("Mjau. Jag är en katt som heter " + name + ".");
    }
  
    String makeSound() {
        return "Purrrrrr";
    }
  
    void fly() {
        System.out.println("Jag kan inte flyga!");
    }
  
  }
