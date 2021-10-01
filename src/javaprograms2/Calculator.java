package javaprograms2;

public class Calculator {
    static int num1;
    static int num2;

    public static double powerInt(int num1, int num2) {
        double a;
        a = Math.pow((double) num1, (double) num2);
        return a;
    }

    public static double powerDouble(double num1, int num2) {
        double b;
        b = Math.pow(num1, (double) num2);
        return b;
    }
}
