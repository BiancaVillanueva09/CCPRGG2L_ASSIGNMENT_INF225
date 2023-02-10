public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person();

        Me.setName("Bianca");
        String myName = Me.getName();
        System.out.println("My name is " + myName + ".");


        Me.setCCNumber(1234567890);
        int myCCNumber = Me.getCCNumber();
        System.out.println("My credit card number is " + myCCNumber + ".");


        Daughter me =  new Daughter();
        System.out.println("My family name is "+ me.surname + ".");
        me.showLove();
    }   
}
