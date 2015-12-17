package model;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository {

	private List<ProductModel> productList;

	public BaseRepository() {
		productList = new ArrayList<>();
	}

	public abstract void addProduct(ProductModel newProduct);

	public abstract void deleteProduct(ProductModel delProduct);

	public abstract List<ProductModel> getAllProductList();

	protected List<ProductModel> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductModel> productList) {
		this.productList = productList;
	}
}
