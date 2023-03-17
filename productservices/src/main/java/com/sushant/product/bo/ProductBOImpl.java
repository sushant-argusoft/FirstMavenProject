package com.sushant.product.bo;
import com.sushant.product.dao.ProductDAO;
import com.sushant.product.dao.ProductDAOImpl;

import com.sushant.product.dto.Product;

public class ProductBOImpl implements ProductBo {
	
	
	private static ProductDAO  dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
        dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
