package model;

import java.util.List;

public class FindChattextLogic {
    public List<Board> executeFindChattext() {
        FindChattextDAO fcdao = new FindChattextDAO();
        List<Board> list = fcdao.findChattext();
        return list;
    }

}
