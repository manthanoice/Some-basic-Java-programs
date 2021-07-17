package SingleTon;

public class AppConfig {
    private AppConfig(){
        System.out.println("Wassup");
    }
    private static AppConfig obj = null;
    public static AppConfig getInstance(){
        if(obj==null)
            obj = new AppConfig();
        return obj;
    }

}
