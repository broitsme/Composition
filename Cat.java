package OopsConcepts.Composition;

//Cat Has-A Limb
public class Cat {
    Limb limb;
    void makeSound(){
        System.out.println("Meow..");
    }
    Cat() {
        limb = new Limb();
    }
}
