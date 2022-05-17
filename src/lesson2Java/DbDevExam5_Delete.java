package lesson2Java;

import java.sql.Connection;

public class DbDevExam5_Delete {
    public static void main(String [] args){
		Connection connection;
		ProductDao productDao;

		connection = DbUtil.getConnection();
		productDao = new ProductDao(connection);

		productDao.delete("ボールペン");
		System.out.println("削除しました");

	}
}
