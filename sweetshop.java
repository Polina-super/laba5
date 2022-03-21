package laba5;

public class sweetshop {
    private final sweetfactory sweetfactory;

    public sweetshop(sweetfactory sweetfactory) {
        this.sweetfactory = sweetfactory;
    }
    public Making StartMaking(String type) {
        Making Making;
        Making = sweetfactory.createsweet(type);
        Making.preparation();
        Making.mixing();
        Making.production();
        Making.check();
        Making.paсking();

        System.out.println("продукт готов");
        return Making;
    }
}
