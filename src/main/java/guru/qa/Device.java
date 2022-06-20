package guru.qa;

public class Device {

    protected static final String producingСompany = "Apple";

    public Device(String owner, String imei, String color, int weight, String status) {
        this.owner = owner;
        this.imei = imei;
        this.color = color;
        this.weight = weight;
        this.status = status;
    }

    protected String owner;
    protected String imei;
    protected String color;
    protected int weight;
    protected String status;

    void certify(){
        System.out.println("Сертифицирован" + '\n');
    }
    void updateOS(){
        System.out.println("ОС ipad с IMEI "+ imei +" обновлена" + '\n');
    }
    void getOwner(){
        System.out.println("Владелец устройства " + owner + '\n');
    }

    void getDevicesName(String name){
        if(name.equals("ipad")){
            System.out.println(iPad.getDeviceName());
        }
        else {
            System.out.println(iPhone.getDeviceName());
        }
    }
    void getNameProducingCompany(){
        System.out.println("Компания производитель " + producingСompany + '\n');
    }



}
