
 package model;
 import java.util.List;

import dao.FindChattextDAO;

public class FindChattextLogic {
    public List<Bbs> executeFindChattext() {
        FindChattextDAO fcdao = new FindChattextDAO();
        List<Bbs> list = fcdao.findchattext();
        return list;
    }

}