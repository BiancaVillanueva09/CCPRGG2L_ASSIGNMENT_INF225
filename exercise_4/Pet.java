public class Pet {
    String name;
    Person owner;

    Pet(String petName, Person ownerName) {
        this.name = petName;
        this.owner = ownerName;
    }

    void showOwnerName(Person Friend) {
        System.out.println("My name is " + this.name + ". My owner's name is " + owner.name + ". -CuteSoleil");
    }
}
