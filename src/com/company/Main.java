package com.company;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("asandb", "postgres", "123");
        db.CreateTable(conn, "Employee");
        db.InsertRow(conn, "Employee", "Assan", "Qostanai");
        db.InsertRow(conn, "Employee", "Eldana", "Astana");
        db.InsertRow(conn, "Employee", "Erasyl", "Atyrau");
        db.InsertRow(conn, "Employee", "Abukhasym", "Zhanaozen");
        db.UpdateName(conn, "Employee", "Erasyl", "Inkara");
        db.SearchById(conn, "Employee", 1);
        db.DeleteRowById(conn, "Employee", 1);
        db.ReadData(conn, "Employee");
        db.DropTable(conn, "Employee");
    }
}
