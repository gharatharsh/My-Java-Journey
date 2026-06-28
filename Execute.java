// package Demooo;

class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void play() {
        System.out.println("Playing...");
    }
}

class Puppy extends Dog {
    public void bark() {
        System.out.println("Barking...");
    }
}

public class Execute {   
    public static void main(String[] args) {
        System.out.println("Multi-level inheritance demo");

        
        Dog d = new Puppy();
        d.eat();
        d.play();

        System.out.println("--------------");

       
        Animal a = new Puppy();
        a.eat();

        System.out.println("--------------");

        
        Animal a3 = new Puppy();
        if (a3 instanceof Puppy) {
            Puppy p = (Puppy) a3;
            p.bark();
            p.eat();
        }
    }
}
