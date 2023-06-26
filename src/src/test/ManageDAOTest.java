package test;

import java.util.List;

import dao.ManageDao;
import model.ManageSlide;


public class ManageDAOTest {
	public static void main(String[] args) {
		ManageDao dao = new ManageDao();
		// select()のテスト
				System.out.println("---------- select()のテスト ----------");
				String user_id = "dojo";
				List<ManageSlide> cardList2 = dao.selectSlide(user_id);
				for (ManageSlide card : cardList2) {
					System.out.println("USER_ID：" + card.getUser_id());
					System.out.println("DATE：" + card.getDate());
					System.out.println("PICTURE：" + card.getPicture());
					System.out.println();
				}
	}
}