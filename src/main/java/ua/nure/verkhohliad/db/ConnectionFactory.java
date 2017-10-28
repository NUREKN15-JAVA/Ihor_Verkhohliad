package ua.nure.verkhohliad.db;

import ua.nure.verkhohliad.db.DatabaseException;

import java.sql.Connection;

public interface ConnectionFactory {

    Connection createConnection() throws DatabaseException;

}
