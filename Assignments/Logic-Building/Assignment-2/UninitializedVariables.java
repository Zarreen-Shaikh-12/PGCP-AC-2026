public class UninitializedVariables {
    public static void main(String[] args) {

        byte a = 10;
        short b = 100;
        int c = 1000;
        long d = 10000L;
        float e = 10.5f;
        double f = 20.5;
        char g = 'A';
        boolean h = true;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }
}