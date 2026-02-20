package exercise5;

public class ResultArithmeticException extends ArithmeticException{
public ResultArithmeticException (Throwable cause) {
super(String.valueOf(cause));
}
}
