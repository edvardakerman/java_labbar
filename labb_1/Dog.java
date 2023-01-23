class Dog extends Animal {
    Dog(String name) {
      super(name);   // Animals konstruktor anropas
    }
  
    void introduceYourself()
    {
      System.out.println("Vovv!!! Jag är en hund som kallas " + name + ".");
    }
  
    String makeSound() {
        return "Vov, vov, vovv!!!";
    }
  
    void fly() {  
      System.out.println("Jag kan inte flyga!");
  }
  
  }
