package model;

public class ProductModel extends BaseModel {

	private long productPrice;
	private String productCategory;
	private String productName;
	private double productDiscountRate;

	public ProductModel(String productCode, long productPrice, String productCategory, String productName, double productDiscountRate) {
		super(productCode);
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productName = productName;
		this.productDiscountRate = productDiscountRate;
	}

	public long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductDiscountRate() {
		return productDiscountRate;
	}

	public void setProductDiscountRate(double productDiscountRate) {
		this.productDiscountRate = productDiscountRate;
	}

	@Override
	public String toString() {
		return "ProductModel{" +
			"productCode=" + getProductCode() + '\'' +
			"productPrice=" + productPrice +
			", productCategory='" + productCategory + '\'' +
			", productName='" + productName + '\'' +
			", productDiscountRate=" + productDiscountRate +
			'}';
	}
}
