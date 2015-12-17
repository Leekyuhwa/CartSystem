package controller;

import model.CartRepository;
import util.InputUtil;
import view.PrintMessage;

/**
 * Created by Coupang on 2015-12-17.
 */
public class CartDeleteController extends BaseController {

	private CartRepository cartRepository = CartRepository.getInstance();

	@Override
	public void execute() {
		PrintMessage.printCartDeleteList(cartRepository.getAllProductList());
		inputMenu();
	}

	@Override
	protected void checkInputValue(Object value) {

	}

	@Override
	protected boolean inputMenu() {
		String inputProductCode = InputUtil.getInputLine();
		checkInputValue(inputProductCode);
		return true;
	}
}