package main.ui;

import main.interfaces.DBData;

public class StudentsDBData implements DBData {
    public String url(){
        return "jdbc:mysql://localhost:3306/studentsProject";
    }

    public String userName(){
        return "root";
    }

    public String password(){
        return "mamalena123";
    }
}
