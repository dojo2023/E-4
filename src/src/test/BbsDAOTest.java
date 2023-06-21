package test;

import dao.BbsDAO;
import model.Bbs;

public class BbsDAOTest {
	public static void main(String[] args) {
		BbsDAO dao = new BbsDAO();
		String user_id = "AAA";
		String name = "AUU";
		String chattext = "TEST";
		String date = "2023/06/14"; 
		int visitor = 0;
		// insert()のテスト
				System.out.println("---------- insert()のテスト ----------");
				Bbs insRec = new Bbs(user_id,name,chattext, date,visitor);
				if (dao.insert(insRec)) {
					System.out.println("登録成功！");
				}
				else {
					System.out.println("登録失敗！");
				}
		/*// detail()のテスト
		System.out.println("---------- select()のテスト ----------");
		User user = dao.detail(new User("dojo","","",height,weight,target_weight));
			System.out.println("NUMBER：" + user.getUser_id());
			System.out.println("COMPANY" + user.getPassword());
			System.out.println("DEPARTMENT" + user.getName());
			System.out.println("POSITION" + user.getHeight());
			System.out.println("NAME" + user.getWeight());
			System.out.println("ZIPCODE" + user.getTarget_weight());
			System.out.println();*/
		
	}
}
/*
		// insert()のテスト
		System.out.println("---------- insert()のテスト ----------");
		Bc insRec = new Bc(" ","会社名６", "部署名６", "役職名６",
				"氏名６", "666-6666", "住所６", "6666-66-6666", "6666-66-0606",
				"mail6@company6.jp", "備考６");
		if (dao.insert(insRec)) {
			System.out.println("登録成功！");
			List<Bc> cardList3 = dao.select(insRec);
			for (Bc card : cardList3) {
				System.out.println("NUMBER：" + card.getNumber());
				System.out.println("COMPANY" + card.getCompany());
				System.out.println("DEPARTMENT" + card.getDepartment());
				System.out.println("POSITION" + card.getPosition());
				System.out.println("NAME" + card.getName());
				System.out.println("ZIPCODE" + card.getZipCode());
				System.out.println("ADDRESS：" + card.getAddress());
				System.out.println("PHONE" + card.getPhone());
				System.out.println("FAX" + card.getFax());
				System.out.println("MAIL" + card.getMail());
				System.out.println("REMARKS" + card.getRemarks());
				System.out.println();
			}
		}
		else {
			System.out.println("登録失敗！");
		}

		// update()のテスト
		System.out.println("---------- update()のテスト ----------");
		Bc upRec = new Bc();
		if (dao.update(upRec)) {
			System.out.println("更新成功！");
			List<Bc> cardList4 = dao.select(upRec);
			for (Bc card : cardList4) {
				System.out.println("NUMBER：" + card.getNumber());
				System.out.println("COMPANY" + card.getCompany());
				System.out.println("DEPARTMENT" + card.getDepartment());
				System.out.println("POSITION" + card.getPosition());
				System.out.println("NAME" + card.getName());
				System.out.println("ZIPCODE" + card.getZipCode());
				System.out.println("ADDRESS：" + card.getAddress());
				System.out.println("PHONE" + card.getPhone());
				System.out.println("FAX" + card.getFax());
				System.out.println("MAIL" + card.getMail());
				System.out.println("REMARKS" + card.getRemarks());
			}
		}
		else {
			System.out.println("更新失敗！");
		}

		// delete()のテスト
		System.out.println("---------- delete()のテスト ----------");
		if (dao.delete("0006")) {
			System.out.println("削除成功！");
		}
		else {
			System.out.println("削除失敗！");
		}
	}
}
*/
