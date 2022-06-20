package guru.qa;

public class Main {
    static Service service = new Service();


    public static void main(String[] args) {
        Device ipad = new iPad("Петя", "UIEURRWO123", "Черный", 500, "new");
        ipad.getDevicesName("ipad");
        ipad.getNameProducingCompany();
        ipad.getOwner();
        ipad.updateOS();

        Device ipadMini = new iPad("Вика", "42214421we", "Серый", 350, "restored");
        System.out.println(ipadMini.toString());
        service.takeDevice(ipadMini, ipadMini.status);


        Device xr = new iPhone("Ваня", "123423", "Зеленый", 100, "new");
        System.out.println(xr.toString());
        service.takeDevice(xr, xr.status);
    }
}
