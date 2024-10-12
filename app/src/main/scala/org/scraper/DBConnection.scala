package org.scraper

import java.sql.{Connection, DriverManager, ResultSet};

class DBConnection(connectionString: String = "jdbc:postgresql://localhost:5432/jobs"){

    def connect(): Option[Connection] = {
        Class.forName("com.postgresql.jdbc.Driver");
        DriverManager.getConnection(connectionString) match {
            case c: Connection => Some(c)
            case _ => None
        }
}

// Write data

}


