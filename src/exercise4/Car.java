package exercise4;

public class Car {
    private String brand;
    private boolean readyToGo;
    public Car (String brand, boolean readyToGo) {
        this.brand = brand;
        this.readyToGo = readyToGo;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isReadyToGo() {
        return readyToGo;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setReadyToGo(boolean readyToGo) {
        this.readyToGo = readyToGo;
    }

    public void checkReadyToGo() throws NotReadyToGoException  {
        if (!isReadyToGo()) {
            throw new NotReadyToGoException(getBrand() + " не готова ехать");
        }
        else {
            System.out.println(getBrand() + " готова  ехать");
        }
    }
}
