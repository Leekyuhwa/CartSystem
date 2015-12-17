package model;

import java.util.List;

/**
 * Created by Coupang on 2015-12-16.
 */
public class CartRepository extends BaseRepository {

	private static CartRepository cartRepository;

	public static synchronized CartRepository getInstance() {
		if (cartRepository == null) {
			cartRepository = new CartRepository();
		}
		return cartRepository;
	}

	@Override
	public void addProduct(ProductModel newProduct) {
		getProductList().add(newProduct);
	}

	@Override
	public void deleteProduct(ProductModel delProduct) {
		getProductList().remove(delProduct);
	}

	@Override
	public List<ProductModel> getAllProductList() {
		return getProductList();
	}

	public void removeAll() {
		getProductList().clear();
	}


}
