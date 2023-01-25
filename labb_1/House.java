import java.util.ArrayList;

class House {

        ArrayList<Animal> animalList = new ArrayList<Animal>();

        public void addAnimal(Animal ani){
            animalList.add(ani);
        }
       
        public void print() {
            System.out.println("Följande djur finns i huset:");
            
            for (Animal animal : animalList) {
                animal.print();
            }
        }
}
