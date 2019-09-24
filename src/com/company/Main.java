package com.company;

import conn.util.Connection;

public class Main {

    public static void main(String[] args) {

        //  We can't create a instance using "new Connection()"
        //  we get the instance using the static method getInstance()
        Connection con = Connection.getInstance();
        con.connect();
        con.disconnect();

        boolean sameType = con instanceof Connection;
        System.out.println("Is of the same type? "+ sameType);

    }
}
