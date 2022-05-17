package lesson2Java;

import java.sql.Connection;


public class DbDevExam5_Select {
	public static void main(String [] args){
		Connection connection;
		ProductDao productDao;

		connection = DbUtil.getConnection();
		productDao = new ProductDao(connection);
		Product result = productDao.findByProductId(102);
		System.out.println("商品番号：" + result.getProductId() + ", 商品名：" + result.getProductName() + ", 値段：" + result.getPrice());
	}
	
	
	
}
