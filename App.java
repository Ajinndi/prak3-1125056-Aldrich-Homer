abstract class Hewan {
    private String name;
    private int age;
    private String food;

    Hewan(String name, int age, String food) {
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

    void printData() {
        System.out.println("Jenis Hewan: " + getClass().getSimpleName());
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age + " tahun");
        System.out.println("Makanan: " + food);
    }
}

abstract class HewanDarat extends Hewan {
    private int numberOfLegs;

    void setNumberOfLLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    int getNumberOfLegs() {
        return numberOfLegs;
    }

    HewanDarat(String name, int age, String food, int numberOfLegs) {
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }
    
    public void move() {
        System.out.println("Hewan darat tersebut berjalan menggunakan 4 kaki");
    }

    @Override
    void printData() {
        super.printData();
        System.out.println("Jumlah Kaki: " + getNumberOfLegs());
        move();
    }
}

class Anjing extends HewanDarat {
    Anjing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Guk Guk");
    }
}
class Kucing extends HewanDarat {
    Kucing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Meow Meow");
    }
}
class Tikus extends HewanDarat {
    Tikus(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Cit Cit");
    }
}

abstract class HewanLaut extends Hewan {
    private double depth;

    void setDepth(double depth) {
        this.depth = depth;
    }
    double getDepth() {
        return depth;
    }

    HewanLaut(String name, int age, String food, double depth) {
        super(name, age, food);
        this.depth = depth;
    }

    @Override
    void printData() {
        super.printData();
        System.out.println("Depth: " + getDepth());
    }
}

class Ikan extends HewanLaut {
    Ikan(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Blub Blub");
    }
}
class Hiu extends HewanLaut {
    Hiu(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Splash / Silent Predator");
    }
}
class Paus extends HewanLaut {
    Paus(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Echolocation Click / Whistle");
    }
}

abstract class HewanUdara extends Hewan {
    private double wingSpan;

    void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    double getWingSpan() {
        return wingSpan;
    }

    HewanUdara(String name, int age, String food, double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }
    
    @Override
    void printData() {
        super.printData();
        System.out.println("Depth: " + getWingSpan());
    }
}

class Burung extends HewanLaut {
    Burung(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Cuit Cuit");
    }
}
class Elang extends HewanLaut {
    Elang(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Kreeee / Screech");
    }
}
class Bebek extends HewanLaut {
    Bebek(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }
    
    @Override
    public void printSound() {
        System.out.println("Suara: Kwek Kwek");
    }
}

public class App {
    public static void main(String[] args) {
        Hewan[] daftarHewan = new Hewan[] {
            new Anjing("Doggy", 3, "Tulang", 4),
            new Kucing("Milo", 2, "Ikan", 4),
            new Tikus("Jerry", 1, "Keju", 4),

            new Ikan("Nemo", 1, "Plankton", 15.0),
            new Hiu("Megalo", 10, "Daging", 500.0),
            new Paus("Bluey", 20, "Krill", 1000.0),

            new Burung("Pipit", 1, "Biji-bijian", 0.2),
            new Elang("Garuda", 5, "Daging", 2.1),
            new Bebek("Donald", 2, "Dedak", 0.8)
        };

        for (Hewan h : daftarHewan) {
            h.printData();
            h.printSound();
            System.out.println("----------------------------------------");
        }
    }
}