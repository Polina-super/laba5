package laba5;

public class sweetfactory {
    public Making createsweet (String type){
        Making Making = null;
        if ("Candy".equals(type)) {
            Making = new Candy();
            System.out.println("Готовится конфета");
        } else if ("Cake".equals(type)) {
            Making = new Cake();
            System.out.println("Готовится торт");
        }
        return Making;
    }
}
