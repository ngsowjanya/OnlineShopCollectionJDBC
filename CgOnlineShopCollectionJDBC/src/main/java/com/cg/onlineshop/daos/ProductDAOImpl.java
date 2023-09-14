 package com.cg.onlineshop.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.cg.onlineshop.Product;
import com.cg.onlineshop.utills.DBUtil;
public class ProductDAOImpl implements ProductDAO{

	private Connection con = DBUtil.getDBConnection();
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into PRODUCT(price,starrating,description,name)values(?,?,?,?)");
			pstmt .setInt(1,product.getPrice());
			pstmt .setInt(2,product.getStarRating());
			pstmt .setString(3,product.getDescription());
			pstmt .setString(4,product.getName());
			//DML
			int rowsEffected=pstmt.executeUpdate();
			System.out.println(rowsEffected+"row inserted");
		//DQL
		pstmt = con.prepareStatement("select max(id) from Product");
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) product.setId(rs.getInt(1));
		return product;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getAllProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Product> getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBulkProducts(List<Product> products) {
		// TODO Auto-generated method stub
		
	}

	
}