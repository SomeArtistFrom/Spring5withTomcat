package web.model;

public class Car {
    private int id;
    private int serial;
    private String model;

    public Car(int id, int serial, String model) {
        this.id = id;
        this.serial = serial;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
