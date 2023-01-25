class Animal {
  private String name;
  private int birthyear;
  private static int currentYear = 2023;
  private Animal friend;
  private Toy toy;

  Animal(String name, int birthyear) {
    this.name = name;
    this.birthyear = Animal.currentYear - birthyear;
  }

  public static void setYear(int newYear){
    Animal.currentYear = newYear;
  }
  public void setFriend(Animal ani){
    this.friend = ani;
  }

  public void addToy(Toy toy){
    this.toy = toy;
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
      System.out.println(this.name + " finns i huset med leksaken " + this.toy.getName());      
    }
    else if (this.toy == null){
      System.out.println(this.name + " finns i huset med kompisen " + this.friend.getName());     
    } else {
      System.out.println(this.name + " finns i huset med kompisen " + this.friend.getName() + " och leksaken " + this.toy.getName());
    }

  }

  void introduceYourself() {
    // ???
    System.out.println("Mjau. Jag är en katt som heter " + this.name + ".");
    System.out.println("Jag är " + getAge() + " år gammal.");
  }

  String makeSound() {
    return "";
  }
  
  void fly() {
    // ???
  }

}
