package lesson21.filters;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class Check {
  public static boolean check_data(ServletRequest req) {
//    if (req instanceof HttpServletRequest) {
//      HttpServletRequest req_http = (HttpServletRequest) req;
//    }
    String xs = req.getParameter("x");
    String ys = req.getParameter("y");
    if (xs != null && ys != null) { // and so on...........
      try {
        int x = Integer.parseInt(xs);
        int y = Integer.parseInt(ys);
      } catch (NumberFormatException ex) {
        return false;
      }
    }
    return true;
  }
}
