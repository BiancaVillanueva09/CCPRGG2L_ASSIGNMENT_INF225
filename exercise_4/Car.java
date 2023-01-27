public class Car {
    String name;
    String owner;
    String attribute;

    public Car(String carName, String carOwner) {
        this.name = carName;
        this.owner = carOwner;
    }
    void showCarOwnerName() {
        System.out.println("The " + this.name + " is owned by me, " + owner + ".");
    }
}
