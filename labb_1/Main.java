class Main{  
  public static void main(String[] args) {

    // Skapar object av subklasserna Cat, Dog, Bird, Butterfly
    // Animal cat       = new Cat("Kurre");
    // Animal dog       = new Dog("Vilma");
    // Animal bird      = new Bird("Pippi");
    // Animal butterfly = new Butterfly("Bella");
  
    // System.out.println("==== Djuren introducerar sig ====");
    // cat.introduceYourself();
    // dog.introduceYourself();
    // bird.introduceYourself();
    // butterfly.introduceYourself();

    // System.out.println("==== Djuren gör sina ljud ====");
    // System.out.println(cat.makeSound());
    // System.out.println(dog.makeSound());
    // System.out.println(bird.makeSound());
    // System.out.println(butterfly.makeSound());
  
    // System.out.println("==== Djuren flyger (om de kan) ====");
    // cat.fly();
    // dog.fly();
    // bird.fly();
    // butterfly.fly();

    Animal kurre      = new Cat("Kurre", 6);
    Animal vilma      = new Bird("Vilma", 3);
    
    kurre.introduceYourself();
    vilma.introduceYourself();
    
  }

}
