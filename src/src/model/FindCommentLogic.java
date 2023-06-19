package model;

import java.util.List;

import dao.FindCommentDAO;

public class FindCommentLogic {
    public List<Board> executeFindComment() {
        FindCommentDAO fcdao = new FindCommentDAO();
        List<Board> list = fcdao.findcomment();
        return list;
    }

}
