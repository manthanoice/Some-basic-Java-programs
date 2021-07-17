/*
    We use abstract class when we know parent class object won't be needed, we only have to work with child class and it's object!
    So this is parent class Car and car extends Ferrari class and Audi class and here main class is RepairShop
    So
*/

package Abstraction;

public abstract class Car {
    public abstract void repair();
    public abstract void price();
}
