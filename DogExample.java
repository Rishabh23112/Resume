public class DogExample {

    // Base Dog class
    static class Dog {
         String name;
         int age;
         String breed;
         int size;
        
        static int numberofDogs=0;
        Dog(){

        }
        Dog(String name, int age, String breed, int size){
            this.name=name;
            this.age=age;
            this.breed=breed;
            this.size=size;

            numberofDogs++;

        }
        void display(){
            System.out.println("Name: "+name);
            System.out.println("age: "+age);
            System.out.println("breed: "+breed);
            System.out.println("size: "+size);
        }
        static int getnumberofdogs(){
            return numberofDogs;
        }
        void eat(){
            System.out.println("Dog is eating.");
        }
        void sleep(){
            System.out.println("Dog is sleeping.");
        }
    }

    

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create instances of PetDog
        Dog dog1 = new Dog("dog", 1, "owner",15);
        Dog dog2 = new Dog("Max", 2, "owner1",15);
        
        // Demonstrate inherited method
        dog1.eat();
        dog2.sleep();
        
        // Display owner details for each PetDog
        dog1.display();
        dog2.display();
        
        // Display total number of PetDog instances
        System.out.println("Total Pet Dogs: " + Dog.getnumberofdogs());
    }
}