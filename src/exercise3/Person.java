package exercise3;

public class Person {
    private String name;
    private boolean readyRun;
    public Person (String name, boolean readyRun) {
        this.name = name;
        this.readyRun = readyRun;
    }

    public String getName() {
        return name;
    }
    public boolean getReadyRun () {
        return readyRun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReadyRun(boolean readyRun) {
        this.readyRun = readyRun;
    }

    public void checkReadyRun () throws NotReadyRunException {
        if (!getReadyRun()) {
            throw new NotReadyRunException();
        }
        else {
            System.out.println(getName() + " готов бежать");
        }
    }
}
