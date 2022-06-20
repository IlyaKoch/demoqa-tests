package guru.qa;

public class Service {
    void takeDevice(Device device, String status){
        if(status.equals("new")) {
            System.out.println("Добро пожаловать на сервис");
            System.out.println("Девайсс IMEI " + device.imei + " сломался");
            device.certify();
            device.status = "inService";
            System.out.println(device.status);
        }
        else {
            System.out.println("У вас нету гарантии");
        }
    }
}
