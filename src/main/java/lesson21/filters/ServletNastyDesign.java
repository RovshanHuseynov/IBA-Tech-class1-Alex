package lesson21.filters;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletNastyDesign extends HttpServlet {
  /**
   * the problem:
   * we have to do a lot of checking stuff to do in each servlet
   * BEFOREHAND real operation
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    try {
      String xs = request.getParameter("x");
      String ys = request.getParameter("y");
      int x = Integer.parseInt(xs);
      int y = Integer.parseInt(ys);
      // extra checks, extra if...
      PrintWriter w = response.getWriter();
      int z = x + y;
      w.println(z);
    } catch (NumberFormatException ex) {
      response.getWriter().println("smt went wrong");
    }
  }
}
