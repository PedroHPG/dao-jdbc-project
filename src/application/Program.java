package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
			
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 5: seller update ===");
		Seller seller = sellerDao.findById(1);
		seller.setName("Martha Gray");
		sellerDao.update(seller);
		System.out.println("Update Complete");
		
	}

}
