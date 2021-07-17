//This will give value 0 automatically unless I uncomment the comment! :D
//This is basically no arguments constructor! :D

package Constructors;

class vehicle{
    int wheel;
    public vehicle() {
        //wheel=4;
    }
}

public class Third {
    public static void main(String[] args) {
        vehicle car = new vehicle();
        System.out.println("Number of vehicles in car is: "+car.wheel);
    }
}
