package com.sushant.product.bo;

import com.sushant.product.dto.Product;

public interface ProductBo {
 void create(Product product );
 Product findProduct(int id);
}
