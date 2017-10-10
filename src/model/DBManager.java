package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	//接続クラス
	public Connection getConnection() throws SQLException {

		//変数宣言
		Connection conn = null;

		String url = "jdbc:mysql://localhost:3306/shoppingsite";
		String user = "root";
		String password = "marujack000";

		//DB接続開始
		try {
			//JDBCドライバのロード
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);

		}
		catch (ClassNotFoundException e) {
			//クラスが見つからない時のエラー処理;
			//クラスが見つかりません
		}
		catch (SQLException e) {
			//接続取得のエラー処理
			//接続に失敗しました
		}
		return conn;
	}

}
