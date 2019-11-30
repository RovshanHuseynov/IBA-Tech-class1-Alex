package lesson21;

import java.sql.Connection;
import java.util.Optional;
import java.util.function.Consumer;

public class DbOpsUsage {
  public static void main(String[] args) {
    Optional<Connection> connOpt = DbOp.connection();

    // way 1
    if (connOpt.isPresent()) {
      Connection conn = connOpt.get();
      //..
    }

    // way 2
    connOpt.ifPresent(conn -> {
      //.....
      System.out.println(conn);
    });

    // way 3
    Optional<Connection> optStep2 = connOpt.map(conn -> {
      //.....
      System.out.println(conn);
      return conn;
    });

    // way 4
    Optional<Integer> optStep3 = connOpt.flatMap(conn -> {
      //.....
      System.out.println(conn);
      return Optional.of(1);
    });

  }
}
