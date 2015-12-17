package view;

import model.ProductModel;

import java.util.List;

public class PrintMessage {

	public void printMainTitle() {

	}

	public static void printPurchaseList(List<ProductModel> productList) {
		System.out.println("---------------상품목록------------------");
		System.out.println("상품명	상품코드	가격	할인율");

		for (ProductModel product : productList) {
			System.out.println(product.toString());
		}
	}

	public static void printInputMessage() {
		System.out.println(" 1. 장바구니에 담기");
		System.out.println(" 2. 장바구니 목록보기");
		System.out.println(" 3. 장바구니 목록 삭제");
		System.out.println(" 4. 구매하기");
		System.out.println(" 5. 프로그램 종료");
		System.out.println("원하는 메뉴를 선택하세요.");
		System.out.print(">>");
	}

	public static void printAddPurchase() {
		System.out.println("1. 상품 구매하기");
		System.out.println("구매할 상품코드를 입력하세요.");
		System.out.print(">>");
	}

	public static void printCartList(List<ProductModel> productList) {
		System.out.println("2. 장바구니 목록보기");
		for (ProductModel product : productList) {
			System.out.println(product.toString());
		}
	}

	public static void printCartDeleteList(List<ProductModel> productList) {
		System.out.println("3. 장바구니 목록 삭제");
		for (ProductModel product : productList) {
			System.out.println(product.toString());
		}
		System.out.println("삭제하고자 하는 상품 코드을 입력하세요.");
	}

}
