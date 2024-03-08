package Java.DesignPatterns.Singleton;

import javax.xml.crypto.Data;

public class DatabaseConnection {
    private static DatabaseConnection dbc = null;
    String url;
    String userName;
    String password;
    String port;

    private DatabaseConnection(){

    }

    //lazy initialization using synchronizes keyword, but causes performance issues
//    public static synchronized DatabaseConnection getInstance(){
//        if(dbc == null){
//            dbc = new DatabaseConnection();
//        }
//        return dbc;
//    }

    //lazy initialization using double check locking
    public static DatabaseConnection getInstance(){
        if(dbc == null){
            synchronized(DatabaseConnection.class) {
                if(dbc == null){
                    dbc = new DatabaseConnection();
                }
            }
        }
        return dbc;
    }
}


