package lesson21.filters;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletBetterDesign extends HttpServlet {
  /**
   * the problem:
   * we have to do a lot of checking stuff to do in each servlet
   * BEFOREHAND real operation
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    if (Check.check_data(req)) {
      int x = Integer.parseInt(req.getParameter("x"));
      int y = Integer.parseInt(req.getParameter("y"));
      int z = x + y;
      PrintWriter w = resp.getWriter();
      w.println(z);
    }
  }
}
