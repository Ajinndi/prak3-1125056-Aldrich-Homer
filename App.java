import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface Movable {
    String move();
}

interface Feedable {
    void eat();
}

abstract class Animal {
    private String name;
    private int age;
    private String food;

    Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }
    
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    void setFood(String food) {
        this.food = food;
    }

    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    String getFood() {
        return food;
    }

    public abstract void printSound();

    public abstract String getJenisHewan();

    void printData() {
        System.out.println("Animal Type: " + getJenisHewan());
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " tahun");
        System.out.println("Food: " + food);
    }
}

abstract class LandAnimal extends Animal implements Movable, Feedable {
    private int numberOfLegs;

    void setNumberOfLLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    int getNumberOfLegs() {
        return numberOfLegs;
    }

    LandAnimal(String name, int age, String food, int numberOfLegs) {
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    void printData() {
        super.printData();
        System.out.println("Legs: " + getNumberOfLegs());
        System.out.println(move());
        eat();
    }
}

class Dog extends LandAnimal {
    Dog(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String getJenisHewan() {
        return "Dog";
    }
    
    @Override
    public void printSound() {
        System.out.println("Sound: Woof Woof");
    }

    @Override
    public String move() {
        return "Movement: Dog is running.";
    }

    @Override
    public void eat() {
        System.out.println("Eating: Dog is eating " + getFood() + ".");
    }
}

class Cat extends LandAnimal {
    Cat(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String getJenisHewan() {
        return "Cat";
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Meow Meow");
    }

    @Override
    public String move() {
        return "Movement: Cat is stalking and walking softly.";
    }

    @Override
    public void eat() {
        System.out.println("Eating: Cat is eating " + getFood() + ".");
    }
}

class Mouse extends LandAnimal {
    Mouse(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String getJenisHewan() {
        return "Mouse";
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Cit Cit / Squeak");
    }

    @Override
    public String move() {
        return "Movement: Mouse is scurrying.";
    }

    @Override
    public void eat() {
        System.out.println("Eating: Mouse is eating " + getFood() + ".");
    }
}

abstract class SeaAnimal extends Animal implements Movable, Feedable {
    private double depth;

    void setDepth(double depth) {
        this.depth = depth;
    }
    double getDepth() {
        return depth;
    }

    SeaAnimal(String name, int age, String food, double depth) {
        super(name, age, food);
        this.depth = depth;
    }

    @Override
    void printData() {
        super.printData();
        System.out.println("Max Depth: " + getDepth());
        System.out.println(move());
        eat();
    }
}

class Fish extends SeaAnimal {
    Fish(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String getJenisHewan() {
        return "Fish";
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Blub Blub");
    }

    @Override
    public String move() {
        return "Movement: Fish is swimming rapidly.";
    }

    @Override
    public void eat() {
        System.out.println("Eating: Fish is eating " + getFood() + ".");
    }
}

class Shark extends SeaAnimal {
    Shark(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String getJenisHewan() {
        return "Shark";
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Silent Splash");
    }

    @Override
    public String move() {
        return "Movement: Shark is gliding through the deep ocean.";
    }

    @Override
    public void eat() {
        System.out.println("Eating: Shark is eating " + getFood() + ".");
    }
}

class Whale extends SeaAnimal {
    Whale(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String getJenisHewan() {
        return "Whale";
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Whale Song / Click");
    }

    @Override
    public String move() {
        return "Movement: Whale is diving gracefully.";
    }

    @Override
    public void eat() {
        System.out.println("Eating: Whale is eating " + getFood() + ".");
    }
}

abstract class AirAnimal extends Animal implements Movable, Feedable {
    private double wingSpan;

    void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    double getWingSpan() {
        return wingSpan;
    }

    AirAnimal(String name, int age, String food, double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }
    
    @Override
    void printData() {
        super.printData();
        System.out.println("Max Depth: " + getWingSpan());
        System.out.println(move());
        eat();
    }
}

class Eagle extends AirAnimal {
    Eagle(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String getJenisHewan() {
        return "Eagle";
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Kreeee / Screech");
    }
    
    @Override
    public String move() {
        return "Movement: Eagle is soaring high in the sky.";
    }
    
    @Override
    public void eat() {
        System.out.println("Eating: Eagle is eating " + getFood() + ".");
    }
}

class Parrot extends AirAnimal {
    Parrot(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String getJenisHewan() {
        return "Parrot";
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Squawk / Echo Words");
    }

    @Override
    public String move() {
        return "Movement: Parrot is fluttering through trees.";
    }

    @Override
    public void eat() {
        System.out.println("Eating: Parrot is eating " + getFood() + ".");
    }
}

class Duck extends AirAnimal {
    Duck(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String getJenisHewan() {
        return "Duck";
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Quack Quack");
    }

    @Override
    public String move() {
       return "Movement: Duck is flying and paddling.";
    }

    @Override
    public void eat() {
        System.out.println("Eating: Duck is eating " + getFood() + ".");
    }
}

public class App {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Animal[] daftarHewan = new Animal[] {
            new Dog("Doggy", 3, "Meat", 4),
            new Cat("Milo", 2, "Fish", 4),
            new Mouse("Jerry", 1, "Cheese", 4),
            
            new Fish("Nemo", 1, "Plankton", 15.0),
            new Shark("Megalo", 10, "Meat", 500.0),
            new Whale("Bluey", 20, "Krill", 1000.0),

            new Eagle("Garuda", 5, "Meat", 2.1),
            new Parrot("Philip", 1, "Seeds", 0.2),
            new Duck("Donald", 2, "Bran", 0.8)
        };
        
        System.out.println("========================================");
        System.out.println("=== DATA SEMUA HEWAN (FOR-EACH LOOP) ===");
        System.out.println("========================================");

        for (Animal h : daftarHewan) {
            h.printData();
            h.printSound();
            animals.add(h);
            System.out.println("----------------------------------------");
        }
        System.out.println();
        
        System.out.println("========================================");
        System.out.println("=== HEWAN SORTED BY NAME (ASCENDING) ===");
        System.out.println("========================================");

        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.getName().compareToIgnoreCase(a2.getName());
            }
        });

        for (int i = 0; i < 9; i++) {
            System.out.println((i + 1) + ". " + animals.get(i).getName() + " (" + animals.get(i).getJenisHewan() + ", " + animals.get(i).getAge() + " tahun)");
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println("=== HEWAN SORTED BY AGE (ASCENDING) ===");
        System.out.println("========================================");

        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
            return Integer.compare(a1.getAge(), a2.getAge());
            }
        });

        for (int i = 0; i < 9; i++) {
            System.out.println((i + 1) + ". " + animals.get(i).getName() + " - " + animals.get(i).getAge() + " tahun");
        }
    }
}