package lesson2Java;

import java.sql.Connection;

public class DbDevExam5_Update {
    public static void main(String [] args){
		Connection connection;
		ProductDao productDao;

		connection = DbUtil.getConnection();
		productDao = new ProductDao(connection);

		Product changeProduct = new Product();
		changeProduct.setProductName("シャープペンシル");
		changeProduct.setPrice(70);
		changeProduct.setProductId(102);
		productDao.update(changeProduct);
		System.out.println("更新しました");

	}
}
