package dao;

import java.sql.Connection;
import java.util.List;


public class DbExam5 {
	public static void main (String[] args) {
		Connection connection;
		ProductDao productDao;
		
		connection = DbUtil.getConnection();
		
		productDao = new ProductDao(connection);
		
		List<Product> list = productDao.findAll();
		
		for (Product p : list) {
			System.out.println("商品ID"+ p.getProductId()+ " ,商品名:"+ p.getProductName()+ " ,値段:"+ p.getPrice());
		}
		
		
		Product newProduct = new Product();
		newProduct.setProductName("ボールペン");
		newProduct.setPrice(200);
		try {
			productDao.register(newProduct);
			System.out.println("登録に成功しました");
		}catch(RuntimeException e) {
			System.out.println("登録に失敗しました");
		}
	}
	
}
