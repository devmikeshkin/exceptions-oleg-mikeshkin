package exercise3;

public class Person {
    private String name;
    private boolean readyRun;
    public Person (String name, boolean readyRun) {
        this.name = name;
        this.readyRun = readyRun;
    }
    public void checkReadyRun () throws NotReadyRunException {
        if (!readyRun) {
            throw new NotReadyRunException();
        }
        else {
            System.out.println(name + " готов бежать");
        }
    }
}
