package controller;

import model.CartRepository;
import model.InputType;
import model.ProductModel;
import model.ProductRepository;
import util.InputUtil;
import view.PrintMessage;

import java.util.ArrayList;
import java.util.List;

public class PurchaseController extends BaseController<Integer> {

	private ProductRepository productRepository = ProductRepository.getInstance();
	private CartRepository cartRepository = CartRepository.getInstance();

	public PurchaseController() {

		List<ProductModel> productModelList = new ArrayList<>();
		productModelList.add(new ProductModel("HT011", 250, "HomeAppliance", "TV", 10));
		productModelList.add(new ProductModel("HC001", 100, "HomeAppliance", "Computer", 10));
		productModelList.add(new ProductModel("HL002", 120, "HomeAppliance", "Laptop", 10));
		productModelList.add(new ProductModel("FC001", 60, "Fashion", "Coat", 0));
		productModelList.add(new ProductModel("FK015", 10, "Fashion", "Knit", 0));
		productModelList.add(new ProductModel("FS207", 5, "Fashion", "Skirt", 0));

		productRepository.setProductList(productModelList);
	}

	@Override
	public void execute() {
		while (true) {
			PrintMessage.printPurchaseList(productRepository.getAllProductList());
			PrintMessage.printInputMessage();
			inputMenu();
		}

	}

	@Override
	protected void checkInputValue(Integer value) {
		InputType inputType = InputType.findInputType(value);
		switch (inputType) {
			case PURCHASE_ADD:
				CartAddController purchaseDetailController = new CartAddController();
				purchaseDetailController.execute();
				break;
			case PURCHASE_LIST_SELECT:
				PrintMessage.printCartList(cartRepository.getAllProductList());
				break;
			case PURCHASE_LIST_DELETE:
				CartDeleteController cartDeleteController = new CartDeleteController();
				cartDeleteController.execute();
				break;
			case PURCHASE_LIST_ORDER:
				OrderController orderController = new OrderController();
				orderController.execute();
				break;
			case PROGRAM_EXIT:
				System.exit(1);
				break;
			default:
				break;
		}
	}

	@Override
	protected boolean inputMenu() {
		int inputMenu = InputUtil.getInputInteger();
		checkInputValue(inputMenu);
		return true;
	}

}
