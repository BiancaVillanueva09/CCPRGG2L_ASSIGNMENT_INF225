public class App {
    public static void main(String[] args) throws Exception {
        
        GroceryItem Item1 = new GroceryItem();
        Item1.name = "Wipes";
        Item1.showItemName();
        Item1.price = 56;
        Item1.showItemprice();

        GroceryItem Item2 = new Toothbrush();
        Item2.name = "Colgate";
        Item2.showItemName();
        Item2.price = 45;
        Item2.showItemprice();

        GroceryItem Item3 = new Toothpaste();
        Item3.name = "Close Up";
        Item3.showItemName();
        Item3.price = 80;
        Item3.showItemprice();

        Cashier Lane1 = new Cashier();
        Lane1.CheckOut(Item1);
        Lane1.CheckOut(Item2);
        Lane1.CheckOut(Item3);

        GroceryItem[] ItemArray = new GroceryItem[3];
        ItemArray[0] =  Item1;
        ItemArray[1] = Item2;
        ItemArray[2] = Item3;

        for (int i = 0; i < ItemArray.length; i++) {
            ItemArray[i].showItemName();
        }

        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();

        Cat myCat = new Cat();
        myCat.walk();
        myCat.run();
    }
}
