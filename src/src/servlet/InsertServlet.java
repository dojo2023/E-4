package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bbs;

/**
* Servlet implementation class BoardServlet
 * @param <BbsDAO>
*/
@WebServlet("/insert")
public class InsertServlet<BbsDAO> extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
  * @see HttpServlet#HttpServlet()
  */
  public InsertServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
  * response)
  */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {

  }

  /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
  * response)
  */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    request.setCharacterEncoding("UTF-8");

    Bbs b = new Bbs();

    b.setName(request.getParameter("name"));
    b.setChattext(request.getParameter("chattext"));

    BbsDAO bbsDAO = new BbsDAO();

    //1件追加
    bbsDAO.insertBbs(b);

    //追加後トップページへリダイレクト
    response.sendRedirect(request.getContextPath() + "/board");

  }

}