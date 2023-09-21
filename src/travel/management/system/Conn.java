package travel.management.system;

import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    Conn() {
        try{
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","lnctu");
            s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
