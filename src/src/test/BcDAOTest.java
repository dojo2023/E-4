package test;
import java.util.List;

import dao.UserDao;
import model.User;

public class BcDAOTest {
	public static void main(String[] args) {
		UserDao dao = new UserDao();

		// detail()のテスト
		System.out.println("---------- select()のテスト ----------");
		User cardList2 = dao.detail(new User());
			System.out.println("NUMBER：" + cardList2.getUser_id());
			System.out.println("COMPANY" + cardList2.getPassword());
			System.out.println("DEPARTMENT" + cardList2.getName());
			System.out.println("POSITION" + cardList2.getHeight());
			System.out.println("NAME" + cardList2.getName());
			System.out.println("ZIPCODE" + cardList2.getZipCode());
			System.out.println();
}

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
