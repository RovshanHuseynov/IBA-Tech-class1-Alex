package lesson21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class DbOp {
  public static Optional<Connection> connection() {
    try {
      return Optional.of(DriverManager.getConnection("","",""));
    } catch (SQLException e) {
      return Optional.empty();
    }
  }
}
