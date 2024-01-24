package test.com.member;

public interface MemberSQL {

	String INSERT = "insert into member(num,id,pw,name,tel) values(seq_member.nextval,?,?,?,?)";

	String UPDATE = "update member set pw=?,name=?,tel=? where num=?";

	String DELETE = "delete from member where num=?";

	String SELECT_ONE = "select * from member where num=?";

	String SELECT_ALL = "select * from member order by num asc";

	String SEARCHLIST_ID = "select * from member where id like ?";

	String SEARCHLIST_NAME = "select * from member where name like ?";

}
