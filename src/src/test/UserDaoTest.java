package test;
import dao.UserDao;
import model.User;

public class UserDaoTest {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		Double height = null;
		Double weight = null;
		Double target_weight = null;
		// detail()のテスト
		System.out.println("---------- select()のテスト ----------");
		User user = dao.detail(new User("dojo","","",height,weight,target_weight));
			System.out.println("NUMBER：" + user.getUser_id());
			System.out.println("COMPANY" + user.getPassword());
			System.out.println("DEPARTMENT" + user.getName());
			System.out.println("POSITION" + user.getHeight());
			System.out.println("NAME" + user.getWeight());
			System.out.println("ZIPCODE" + user.getTarget_weight());
			System.out.println();


		// insert()のテスト
		System.out.println("---------- insert()のテスト ----------");
		User insRec = new User("dojo", "password", "" , null, null, null);
		if (dao.insert(insRec)) {
			System.out.println("登録成功！");
		}
		else {
			System.out.println("登録失敗！");
		}
	}
}


/*
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