package controller;

import model.CartRepository;
import model.ProductModel;
import util.InputUtil;
import view.PrintMessage;

public class CartDeleteController extends BaseController<String> {

	private CartRepository cartRepository = CartRepository.getInstance();

	@Override
	public void execute() {
		PrintMessage.printCartDeleteList(cartRepository.getAllProductList());
		inputMenu();
	}

	@Override
	protected void checkInputValue(String value) {
		ProductModel product = cartRepository.findProductByProductCode(value);
		cartRepository.deleteProduct(product);
	}

	@Override
	protected boolean inputMenu() {
		String inputProductCode = InputUtil.getInputLine();
		checkInputValue(inputProductCode);
		return true;
	}
}
