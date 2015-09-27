package main.logic;

import main.interfaces.DBData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBStatement {
    private Statement statement;

    public DBStatement(DBData dbData){
        try{
            Connection connection = DriverManager.getConnection(dbData.url(),dbData.userName(),dbData.password());
            statement = connection.createStatement();
        }
        catch (SQLException e){
            e.getMessage();
            e.getSQLState();
            e.getErrorCode();
        }
    }

    public Statement getStatement(){
        return statement;
    }
}
