/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.slyver.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andres
 */
public class database {
    public static Connection database;
    public static Statement statement;
    public static PreparedStatement pstmt;
    public static ResultSet rs;
    public static String sql;
    
    public database() throws SQLException, ClassNotFoundException {
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        database = DriverManager.getConnection("jdbc:sqlserver://xxxx\\xxxx:1433;databaseName=xx", "xxx", "xxx");
        statement = database.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
        
    }
    
    
    
}
