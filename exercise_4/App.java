public class App {
    public static void main(String[] args) {

        Person Friend = new Person("Marielle", 17);
        Myself me = new Myself("Bianca Villanueva", 18);
        me.addFriend(Friend);
        Pet Hamster = new Pet("Soleil", Friend);
        Hamster.showOwnerName(Friend);
        Car Car = new Car("car", "Bianca");
        Car.showCarOwnerName();
    }
}
