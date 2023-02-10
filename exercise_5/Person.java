public class Person {
    private String name;
    private int CCNumber;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCCNumber(int CreditCardNumber) {
        this.CCNumber = CreditCardNumber;
    }

    public int getCCNumber() {
        return this.CCNumber;
    }
}
