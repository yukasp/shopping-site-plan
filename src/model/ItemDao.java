package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Item;

public class ItemDao {

	public ItemDao() throws SQLException {
	}

	//DBからデータを取ってくるメソッド
	public List<Item> findItemAll() throws SQLException {

			//DBに接続
			DBManager db = new DBManager();
			Connection conn = db.getConnection();

			//SQL文を生成
			PreparedStatement ps = conn.prepareStatement("select item.itemId,itemName,price,quantity from item join stock on item.itemId = stock.itemId;");

			//結果セットを代入
			ResultSet rs = ps.executeQuery();


			List<Item> itemList = new ArrayList<Item>();

			while (rs.next()) {
				itemList.add(new Item(
					rs.getString("itemId"),
					rs.getString("itemName"),
					rs.getInt("price"),
					rs.getInt("quantity")
				));
			}
			return itemList;
	}

	//購入履歴テーブルの更新


	//購入履歴検索

	//

}


