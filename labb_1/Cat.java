class Cat extends Animal {
    Cat(String name, int birthyear) {
      super(name, birthyear);   // Animals konstruktor anropas
    }
  
    void introduceYourself()
    {
      System.out.println("Mjau. Jag är en katt som heter " + getName() + ".");
      System.out.println("Jag är " + getAge() + " år gammal.");
    }
  
    String makeSound() {
        return "Purrrrrr";
    }
  
    void fly() {
        System.out.println("Jag kan inte flyga!");
    }
  
  }
