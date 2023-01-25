import java.util.ArrayList;

class House {

        // Initierar Array
        ArrayList<Animal> animalList = new ArrayList<Animal>();

        // funktion som tar emot ett object (Animal) och lägger till det i arrayen animalList
        public void addAnimal(Animal ani){
            animalList.add(ani);
        }
       
        public void print() {
            System.out.println("Följande djur finns i huset:");
            
            // for loop som går igenom arrayen och anropar print funktionen som tillhör animal klassen
            for (Animal animal : animalList) {
                animal.print();
            }
        }
}
