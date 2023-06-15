package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BbsDao;
import model.Bbs;

/**
* Servlet implementation class BoardServlet
 * @param <BbsDAO>
*/
@WebServlet("/board")
public class BoardServlet<BbsDAO> extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
  * @see HttpServlet#HttpServlet()
  */
  public BoardServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
  * response)
  */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    request.setCharacterEncoding("UTF-8");
//top
    BbsDao bbsDAO = new BbsDao();

    //全件取得
    List<Bbs> list = bbsDAO.selectAllBbs();

    request.setAttribute("list", list);

    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/board.jsp");
    rd.forward(request, response);

  }

  /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
  * response)
  */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    doGet(request, response);
  }

}