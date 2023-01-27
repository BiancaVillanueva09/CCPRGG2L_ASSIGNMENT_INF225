public class Myself {
    String name;
    int age;

    Myself(String myName, int myAge) {
        this.name = myName;
        this.age = myAge;
    }

    void addFriend(Person friend) {
        System.out.println("I am friends with " + friend.name + ".");
    }
}
