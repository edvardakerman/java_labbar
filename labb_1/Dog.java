class Dog extends Animal {
    Dog(String name, int birthyear) {
      super(name, birthyear);   // Animals konstruktor anropas
    }
  
    void introduceYourself()
    {
      System.out.println("Vovv!!! Jag är en hund som kallas " + getName() + ".");
      System.out.println("Jag är " + getAge() + " år gammal.");
    }
  
    String makeSound() {
        return "Vov, vov, vovv!!!";
    }
  
    void fly() {  
      System.out.println("Jag kan inte flyga!");
  }
  
  }
