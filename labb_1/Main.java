class Main{

  public static void introduceYourself(Animal ani)
  {
    if (ani.type.equals("Cat")) {
      System.out.println("Mjau. Jag är en katt som heter " + ani.name + ".");
    } else if (ani.type.equals("Dog")) {
      System.out.println("Vovv!!! Jag är en hund som kallas " + ani.name + ".");
    } else if (ani.type.equals("Bird")) {
      System.out.println("Pip Pip! Jag är en fågel vid namn " + ani.name + ".");
    } else if (ani.type.equals("Butterfly")) {
      System.out.println("Hej, jag är fjärilen " + ani.name + ".");
    } else if (ani.type.equals("Goat")) {
      System.out.println("calling.. .. .. You have reached the GOAT, " + ani.name + ".");
    } else {
      System.out.println("Morr. Jag är ett djur som heter " + ani.name + ".");
    }
  }


  public static String makeSound(Animal ani) {
    if (ani.type.equals("Cat")) {
      return "Purrrrrr";
    } else if (ani.type.equals("Dog")) {
      return "Vov, vov, vovv!!!";
    } else if (ani.type.equals("Bird")) {
      return "Pip pip!";
    } else if (ani.type.equals("Goat")) {
      return "Eddie > Rash!";
    } else {
      return "";
    }
  }

  public static void fly(Animal ani) {
    if (ani.type.equals("Bird") || ani.name.equals("Nketiah") || ani.type.equals("Butterfly")) {
	System.out.println("Flax flax, jag flaxar med vingarna!");
    } else {
      System.out.println("Jag kan inte flyga!");
    }
  }
    
  
  public static void main(String[] args) {
    Animal cat       = new Animal("Cat", "Kurre");
    Animal dog       = new Animal("Dog", "Vilma");
    Animal bird      = new Animal("Bird", "Pippi");
    Animal butterfly = new Animal("Butterfly", "Bella");
    Animal goat      = new Animal("Goat", "Nketiah");

    System.out.println("==== Djuren introducerar sig ====");
    introduceYourself(cat);
    introduceYourself(dog);
    introduceYourself(bird);
    introduceYourself(butterfly);
    introduceYourself(goat);

    Animal[] allAnimals = new Animal[5];
    allAnimals[0] = cat;
    allAnimals[1] = dog;
    allAnimals[2] = bird;
    allAnimals[3] = butterfly;
    allAnimals[4] = goat;

    System.out.println("==== Djuren gör sina ljud ====");
    for (int i = 0; i < allAnimals.length ; i++) {
      System.out.println(makeSound(allAnimals[i]));
    }
      
    System.out.println("==== Djuren flyger (om de kan) ====");
    for (int i = 0; i < allAnimals.length ; i++) {
      fly(allAnimals[i]);
    }
    
  }

}
