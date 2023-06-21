package test;

import java.util.List;

import dao.FindChattextDAO;
import model.Bbs;

public class FindChattextDAOTest {
	public static void main(String[] args) {
				FindChattextDAO dao = new FindChattextDAO();
				
				// select()のテスト
				System.out.println("---------- select()のテスト ----------");
				List<Bbs> list =dao.select(new Bbs("","","","",1));
				for(Bbs bbs : list) {
					System.out.println("USER_ID：" + bbs.getUser_id());
					System.out.println("NAME" + bbs.getName());
					System.out.println("CHATTEXT" + bbs.getChattext());
					System.out.println("DATE" + bbs.getDate());
					System.out.println("VISITOR" + bbs.getVisitor());
		}
	}
}