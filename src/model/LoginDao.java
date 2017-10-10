package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	public LoginDao() throws SQLException {

	}




	/**
     * データベースから指定されたIDとパスワードを使いユーザ情報を検索
     *
     * @param id	ログインID
     * @param pass	パスワード
     * @return	ユーザ情報（ResultSet）
     * @throws SQLException
     */
	public User findUserByIdAndPass(String id,String pass) throws SQLException {

		//DBに接続
		DBManager db = new DBManager();
		Connection conn = db.getConnection();

		//SQL文を生成
		PreparedStatement ps = null;
		ps = conn.prepareStatement("select * from user where id = ? and pass = ?");

		//生成したSQL文の「?」の部分にIDとパスワードをセット
		ps.setString(1, id);
		ps.setString(2, pass);

		ResultSet rs = null;
		rs = ps.executeQuery();

		if (rs.next()) {
			User user = new User(
					rs.getString("id"),
					rs.getString("name"),
					rs.getString("pass"),
					rs.getInt("age"));
			return user;
		} else {
			throw new DataNotFoundException();
		}

	}
}
