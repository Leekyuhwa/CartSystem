package controller;

import model.CartRepository;
import model.ProductModel;
import model.ProductRepository;
import util.InputUtil;
import view.PrintMessage;

public class CartAddController extends BaseController<String> {

	private ProductRepository productRepository = ProductRepository.getInstance();
	private CartRepository cartRepository = CartRepository.getInstance();

	@Override
	public void execute() {
		PrintMessage.printAddPurchase();
		inputMenu();
	}

	@Override
	protected void checkInputValue(String value) {
		ProductModel product = productRepository.findProductByProductCode(value);

		if (product == null) {
			return;
		}

		cartRepository.addProduct(product);
	}

	@Override
	protected boolean inputMenu() {
		String inputProductCode = InputUtil.getInputLine();
		checkInputValue(inputProductCode);
		return true;
	}
}
