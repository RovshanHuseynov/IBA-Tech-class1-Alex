package lesson18.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionApp {
  public static void main(String[] args) throws SQLException {
    Connection conn = DbConnection.getConnection();

    final String SQLS = "SELECT * FROM messages";
    PreparedStatement stmt = conn.prepareStatement(SQLS);
    ResultSet rset = stmt.executeQuery();
    // processing data
    while (rset.next()) {
      String line = String.format("id: %d, sender:%d, receiver:%d, message:%s",
          rset.getInt("id"),
          rset.getInt("user_from"),
          rset.getInt("user_to"),
          rset.getString("content"));
      System.out.println(line);
    }
  }
}
