package controller;

import model.CartRepository;
import view.PrintMessage;

public class OrderController extends BaseController {

	private CartRepository cartRepository = CartRepository.getInstance();

	@Override
	public void execute() {
		PrintMessage.printOrderList(cartRepository.getAllProductList());
	}

	@Override
	protected void checkInputValue(Object value) {
		//not work
	}

	@Override
	protected boolean inputMenu() {
		//not work
		return false;
	}
}
