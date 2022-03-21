package laba5;

public class main {
    public static void main(String[] args) {
        sweetfactory factory = new sweetfactory();
        sweetshop sweetshop = new sweetshop(factory);
        sweetshop.StartMaking("Cake");

    }
}
