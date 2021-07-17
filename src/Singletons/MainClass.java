//Here name of each object is same but since we have used singleton pattern value of them will be same as defined in Appconfig.java
//Happy coding :D

package Singletons;

public class MainClass {
    public static void main(String[] args) {
        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();
        AppConfig obj3 = AppConfig.getInstance();
        AppConfig obj4 = AppConfig.getInstance();
        AppConfig obj5 = AppConfig.getInstance();
        AppConfig obj6 = AppConfig.getInstance();
    }
}
