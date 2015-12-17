package controller;

import model.ProductModel;
import model.ProductRepository;
import model.CartRepository;
import util.InputUtil;
import view.PrintMessage;

/**
 * Created by Coupang on 2015-12-16.
 */
public class CartAddController extends BaseController<String>{

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
