package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BbsDAO;
import model.Bbs;
import model.User;

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
        BbsDAO fct = new BbsDAO();
        List<Bbs> list = fct.selectAll();

        // セッションスコープにコメントリストを保存
       // HttpSession session = request.getSession();
     //   session.setAttribute("listAttribute", list);
        request.setAttribute("list", list);
        
        RequestDispatcher rd =request.getRequestDispatcher("/WEB-INF/jsp/board.jsp");
        rd.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
		if (session.getAttribute("profile") == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}
    	request.setCharacterEncoding("UTF-8");

        // 入力された値を取得
    	User usr =  (User)session.getAttribute("profile");
    	String user_id = usr.getUser_id();
        //String user_id = request.getParameter("user_id");//session userid get
        String name = usr.getName();//session~
        String chattext = request.getParameter("chattext");
        
        //ここから3文は日付取得
        Calendar cal = Calendar.getInstance();
        //SimpleDateFormatで書式を指定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //Calendarの日付をSimpleDateFormatで指定した書式で文字列に変換
        String date = (sdf.format(cal.getTime()));
        
        
        //JavaBeansに格納
        Bbs bo = new Bbs(user_id,name, chattext,  date, 0, 0);
        bo.setUser_id(user_id);
        bo.setName(name);
        bo.setChattext(chattext);
        bo.setDate(date);
        bo.setVisitor(0);
        bo.setBbsid(0);
        
        
        // DBに格納
        BbsDAO acl = new BbsDAO();
        acl.insert(bo);

        // 今入力されたコメントと既存のコメントをh2dbから取得
       /*
        FindChattextLogic fcl = new FindChattextLogic();
        List<Bbs> list = fcl.executeFindChattext();
        
        // セッションスコープにコメントリストを保存
        HttpSession session = request.getSession();
        session.setAttribute("listAttribute", list);
        */
        RequestDispatcher rd =request.getRequestDispatcher("/WEB-INF/jsp/board.jsp");
        rd.forward(request, response);
        
        /*
     // 閲覧ページにフォワードする ＊名前が押されたら
     		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/browse.jsp");
     		dispatcher.forward(request, response);
     		*/
    }

}
