import application.Application;
import dbenum.DBEnum;

public class EntryPoint {

    public static void main(String[] args) {
        new Application(DBEnum.H2).startApplication();
    }
}
