import exercise3.NotReadyRunException;
import exercise3.Person;
import exercise4.Car;
import exercise4.NotReadyToGoException;
import exercise5.ResultArithmeticException;

public class Homework {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        String string = null;
        try {
            string.length();
        } catch (NullPointerException e) {
            System.out.println("Попытка вызова метода у переменной со значением null");
        }
        System.out.println();

        System.out.println("Задание 2");
        int[] massiv = new int[2];
        try {
            int i = massiv[4] / 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Попытка обратиться к элементу массива по несуществующему индексу");
        }
        System.out.println();

        System.out.println("Задание 3");
        Person person = new Person("Денис", true);
        try {
            person.checkReadyRun();
        } catch (NotReadyRunException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Задание 4");
        Car car = new Car("Mazda", true);
        try {
            car.checkReadyToGo();
        } catch (NotReadyToGoException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Задание 5");
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            throw new ResultArithmeticException(e);
        }
        finally {
            System.out.println();


            System.out.println("Задание 6");
            double i = Math.random();
            System.out.println(i);
            try {
                if (i <= 0.3) {
                    throw new NullPointerException();
                } else if (i >= 0.6) {
                    throw new ArrayIndexOutOfBoundsException();
                } else {
                    throw new ArithmeticException();
                }
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
        }
    }
}

