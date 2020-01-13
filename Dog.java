package OopsConcepts.Composition;

//Dog Has-A Limb
public class Dog {
    Limb limb;
    void makeSound(){
        System.out.println("Bark!");
    }
    Dog() {
        limb = new Limb();
    }
}