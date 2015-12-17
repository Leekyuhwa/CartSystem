package model;

import java.util.List;

public class ProductRepository extends BaseRepository {

	private static ProductRepository productRepository;

	public static synchronized ProductRepository getInstance() {
		if (productRepository == null) {
			productRepository = new ProductRepository();
		}
		return productRepository;
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

	public ProductModel findProductByProductCode(String productCode) {
		if (productCode == null) {
			return null;
		}

		for (ProductModel product : getProductList()) {
			if (product.getProductCode().equals(productCode)) {
				return product;
			}
		}

		return null;
	}

}
