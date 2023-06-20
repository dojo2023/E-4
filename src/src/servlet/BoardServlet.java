package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AddChattextLogic;
import model.Board;
import model.FindChattextLogic;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //リスナークラスに移動したい
        request.setCharacterEncoding("UTF-8");

        // 既存のコメントを確認
        FindChattextLogic fcl = new FindChattextLogic();
        List<Board> list = fcl.executeFindChattext();

        // セッションスコープにコメントリストを保存
        HttpSession session = request.getSession();
        session.setAttribute("listAttribute", list);

        RequestDispatcher rd =request.getRequestDispatcher("/WEB-INF/jsp/board.jsp");
        rd.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        // 入力された値を取得
        String name = request.getParameter("name");
        String chattext = request.getParameter("chattext");
        
        
        //JavaBeansに格納
        Board bo = new Board();
        bo.setName(name);
        bo.setChattext(chattext);

        // DBに格納
        AddChattextLogic acl = new AddChattextLogic();
        acl.executeAddChattext(bo);

        // 今入力されたコメントと既存のコメントをh2dbから取得
        FindChattextLogic fcl = new FindChattextLogic();
        List<Board> list = fcl.executeFindChattext();

        // セッションスコープにコメントリストを保存
        HttpSession session = request.getSession();
        session.setAttribute("listAttribute", list);
        
        RequestDispatcher rd =request.getRequestDispatcher("/WEB-INF/jsp/board.jsp");
        rd.forward(request, response);
        
     // 閲覧ページにフォワードする ＊名前が押されたら
     		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/browse.jsp");
     		dispatcher.forward(request, response);
    }

}
