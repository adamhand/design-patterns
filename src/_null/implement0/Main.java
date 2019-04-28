package _null.implement0;

public class Main {
    public static void main(String[] args) {
        AbstractOperation operation = func(-1);
        operation.request();
        operation = func(1);
        operation.request();
    }

    public static AbstractOperation func(int para){
        if (para < 0){
            return new NullOperation();
        }else {
            return new  RealOperation();
        }
    }
}
