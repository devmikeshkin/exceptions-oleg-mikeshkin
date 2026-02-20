package exercise4;

public class Car {
    String brand;
    boolean readyToGo;
    public Car (String brand, boolean readyToGo) {
        this.brand = brand;
        this.readyToGo = readyToGo;
    }
    public void checkReadyToGo() throws NotReadyToGoException  {
        if (!readyToGo) {
            throw new NotReadyToGoException(brand + " не готова ехать");
        }
    }
}
