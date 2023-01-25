class Animal {
  private String name;
  private int birthyear;
  private static int currentYear = 2023;
  private String friend;
  private String toy;

  Animal(String name, int birthyear) {
    this.name = name;
    this.birthyear = Animal.currentYear - birthyear;
  }

  public static void setYear(int newYear){
    Animal.currentYear = newYear;
  }
  public void setFriend(Animal ani){
    this.friend = ani.getName();
  }

  public void addToy(Toy toy){
    this.toy = toy.getName();
  }

  public int getAge(){
    return currentYear - this.birthyear;
  }

  public String getName(){
    return this.name;
  }

  public int getBirthyear(){
    return this.birthyear;
  }

  void print(){

    if (this.friend == null && this.toy == null){
      System.out.println(this.name + " finns i huset");      
    }
    else if (this.friend == null){
      System.out.println(this.name + " finns i huset med leksaken " + this.toy);      
    }
    else if (this.toy == null){
      System.out.println(this.name + " finns i huset med kompisen " + this.friend);     
    } else {
      System.out.println(this.name + " finns i huset med kompisen " + this.friend + " och leksaken " + this.toy);
    }

  }

  void introduceYourself() {
    // ???
    System.out.println("Mjau. Jag är en katt som heter " + this.name + ".");
    System.out.println("Jag är " + getAge() + " år gammal.");
  }

  String makeSound() {
    return ""; // ???
  }
  
  void fly() {
    // ???
  }

}
