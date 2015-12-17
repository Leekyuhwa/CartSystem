public class Product {
	String cate;
	String name;
	String code;
	int price;

	Product(String cate, String name, String code, int price) {
		this.cate = cate;
		this.name = name;
		this.code = code;
		this.price = price;
	}

	void instance() {

		if (cate.equals("HomeAppliances")) {
			new HomeAppliances(cate, name, code, price);
		}
		if (cate.equals("Fashion")) {
			new Fashion(cate, name, code, price);
		}
	}

	public String toString() {
		return "[ cate: " + cate + ", name: " + name + ", code: " + code + ", price: " + price + " ]";
	}
}




