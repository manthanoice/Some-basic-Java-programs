package Encapsulation;

public class Functions {
    private double x,y;
    private char c;
    private double sum;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if(x>Double.MAX_VALUE)
            System.out.println("Invalid number :(");
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if(y>Double.MAX_VALUE)
            System.out.println("Invalid number :(");
        this.y = y;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        if(c=='+') {
            sum=x+y;
            System.out.println("------------------Doing Addition----------------");
            System.out.println(x+" + "+y+" = "+sum);
            System.out.println("------------------Addition Ended----------------");
        }if(c=='-') {
            sum=x-y;
            System.out.println("------------------Doing Subtraction----------------");
            System.out.println(x+" - "+y+" = "+sum);
            System.out.println("------------------Subtraction Ended----------------");
        }if(c=='*') {
            sum=x*y;
            System.out.println("------------------Doing Multiplication----------------");
            System.out.println(x+" * "+y+" = "+sum);
            System.out.println("------------------Multiplication Ended----------------");
        }if(c=='/') {
            sum=x/y;
            System.out.println("------------------Doing Division----------------");
            System.out.println(x+" / "+y+" = "+sum);
            System.out.println("------------------Division Ended----------------");
        }if(c=='%') {
            sum=x%y;
            System.out.println("------------------Doing Remainder----------------");
            System.out.println(x+" % "+y+" = "+sum);
            System.out.println("------------------Remainder Ended----------------");
        }
        this.c = c;
    }
}
