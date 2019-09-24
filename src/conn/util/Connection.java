package conn.util;

public class Connection {

    //  Statement of variable that contains the global instance
    private static Connection instance;

    //  Private constructor to to make inaccessible this in outside
    //  prevent the creation of instances with the "new" statement
    private Connection()
    {

    }
    //  Method that returns the instance initializing it if is null
    public static Connection getInstance()
    {
        if(instance == null){
            instance = new Connection();
        }
        return instance;
    }

    //  Method to test functioning
    public void connect()
    {
        System.out.println("Now is connected to DB");
    }
    //  Method to test functioning
    public void disconnect()
    {
        System.out.println("The connection has finished");
    }
}
