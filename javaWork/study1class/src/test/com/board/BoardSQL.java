package test.com.board;

public interface BoardSQL {
	String SELECT_ALL = "select * from board order by  num asc";
	String SELECT_ONE = "select * from board where num=?";
	String INSERT = "insert into board(num,title,content,writer) values (seq_board.nextval,?,?,?)";
	String DELETE = "delete from board where num=?";
	String UPDATE = "update board set title=?,content=?,writer=?,wdate=sysdate where num=?";
	String SEARCHLIST_TITLE = "select * from board where title like ? order by num desc";
	String SEARCHLIST_CONTENT = "select * from board where content like ? order by num desc";
}
