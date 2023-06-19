package model;

import java.util.List;

import dao.FindChattextDAO;

public class FindChattextLogic {
    public List<Board> executeFindChattext() {
        FindChattextDAO fcdao = new FindChattextDAO();
        List<Board> list = fcdao.findchattext();
        return list;
    }

}
