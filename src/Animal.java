//interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep();
    public void color();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
    public void color() {
        System.out.println("Pink");
    }
}
abstract class Dog implements Animal {
    public void sleep() {
        System.out.println("Grrh grrh");
    }
}

class Animals {
    public static void main(String [] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        myPig.color();


    }
}
