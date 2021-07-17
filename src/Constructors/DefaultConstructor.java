package Constructors;

class A{
    int i;
    float f;
    boolean b;
    String s;
    double d;
    long l;
    char c;
    short st;
    byte bt;
}

public class DefaultConstructor {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.i);
        System.out.println(obj.f);
        System.out.println(obj.b);
        System.out.println(obj.s);
        System.out.println(obj.d);
        System.out.println(obj.l);
        System.out.println(obj.c);
        System.out.println(obj.st);
        System.out.println(obj.bt);
    }
}
