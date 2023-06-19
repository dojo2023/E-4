package model;

import dao.AddChattextDAO;

public class AddChattextLogic {
    public void executeAddChattext(Board bo) {
        AddChattextDAO acdao = new AddChattextDAO(bo);
    }
}
