package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement ps = null;

	public LoginDao() throws SQLException {
		try {
			//JDBCドライバのロード
			Class.forName("com.mysql.jdbc.Driver");

			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingsite","root","marujack000");
		}
		catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	/**
     * データベースから指定されたIDとパスワードを使ってユーザ情報を検索します.
     *
     * @param id	ログインID
     * @param pass	パスワード
     * @return	ユーザ情報（ResultSet）
     * @throws SQLException
     */

	public ResultSet selectUser(String id,String pass) throws SQLException {
		//SQL文を生成
		this.ps = this.conn.prepareStatement("select name, age from user where id = ? and pass = ?");

		//生成したSQL文の「?」の部分にIDとパスワードをセット
		this.ps.setString(1, id);
		this.ps.setString(2, pass);

		//SQLを実行
		this.rs = this.ps.executeQuery();

		return this.rs;
	}

	/**
     * コネクションをクローズします.
     */

	public void close() {
		try {
			//データベースとの接続を解除する
			if(this.conn != null) {
				this.conn.close();
			}
			if(this.ps != null) {
				this.ps.close();
			}
			if(this.rs != null) {
				this.rs.close();
			}
		} catch(SQLException se) {
			//データベースとの接続解除に失敗した場合
			se.printStackTrace();
		}
	}
}
