import java.util.*;


public class Purchase {
	public final static double HOME_SALE = 0.1;
	public final static double FASHION_SALE = 0;
	
	static ArrayList list = new ArrayList();
	static Scanner s = new Scanner(System.in);
	
//	public static void main(String[] args){
//
//		while(true){
//			switch(displaymenu()){
//			case 1:
//				inputList();
//				break;
//			case 2:
//				displayList();
//				break;
//			case 3:
//				deleteList();
//				break;
//			case 4:
//				pay();
//				break;
//			case 5:
//				System.out.println("???α?? ????");
//				System.exit(0);
//
//			}
//		}
//
//	}
//

	static int displaymenu(){
		
		System.out.println("---------------상품목록------------------");
		System.out.println("카테고리: HomeAppliance ("+HOME_SALE*100+"% discount event)");
		System.out.println("상품명			|상품코드			|가격");
		System.out.println("Computer	|HC001			|100");
		System.out.println("Laptop		|HL002			|120");
		System.out.println("Tv			|HT011			|250");
		System.out.println("---------------------------------------");
		System.out.println("카테고리 : Fashion ("+FASHION_SALE*100+"% discount event)");
		System.out.println("상품명			|상품코드			|가격");
		System.out.println("Coat			|FC001			|60");
		System.out.println("Knit			|FK015			|10");
		System.out.println("Skirt			|FS207			|5");
		System.out.println();
		System.out.println(" 1. 장바구니에 담기");
		System.out.println(" 2. 장바구니 목록보기");
		System.out.println(" 3. 장바구니 목록 삭제");
		System.out.println(" 4. 구매하기");
		System.out.println(" 5. 프로그램 종료");
		System.out.println("원하는 메뉴를 선택하세요.");
		System.out.print(">>");

		int menu = 0;
		
		do{
			try{
				menu = Integer.parseInt(s.nextLine().trim());
				
				if(menu >= 1 || menu <= 5){
					break;
				}else{
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력하세요.(1~5)");
			}
		}while(true);
		
		return menu;
		
		
	}
	
	static void inputList(){
		System.out.println("1. 상품 구매하기");
		System.out.println("구매할 상품 명을 입력하세요.(카테고리,상품명,상품코드,가격)");
		System.out.println("입력을 마치려면 q를 입력하세요.");
		
		while(true){
			try{
				System.out.print(">>");
				
				String input = s.nextLine().trim();
				if(!input.equalsIgnoreCase("q")){
					Scanner s2 = new Scanner(input).useDelimiter(",");
					
					list.add(new Product(s2.next(), s2.next(), s2.next(), s2.nextInt()));
					System.out.println("잘 입력되었습니다.");
				}else{
					return;
				}
			}catch(Exception e){
				System.out.println("입력오류. 상품목록에 있는 명칭과 동일하게 입력해주세요.");
			}
		}
	}
	
	static void displayList(){
		System.out.println("2. 장바구니 목록보기");
		
		int length = list.size();
		
		for(int i=0; i<length; i++){
			System.out.println(list.get(i));
		}
		
	}

	static void deleteList(){
		System.out.println("3. 장바구니 목록 삭제");
		displayList();
		System.out.println("삭제하고자 하는 상품 코드을 입력하세요.");
		
		try{
			System.out.print(">>");
			
			String input = s.nextLine().trim();
			boolean found = false;
			
			if(!input.equalsIgnoreCase("q")){
				
				for(int i=0; i < list.size(); i++){
					Product product = (Product)list.get(i);
					
					if(input.equals(product.code)){
						list.remove(i);
						found = true;
					}
				}
			}

			if(found){
				System.out.println("삭제 되었습니다.");
			}else{
				System.out.println("일치하는 값이 없습니다.");
			}

		}catch(Exception e){
			System.out.println("입력오류입니다. 다시입력하세요.");
		}
	}
	
	static void pay(){

		System.out.println("4. 구매하기");

		double sum = 0;
		int length = list.size();
		
	
		for(int i=0; i<length; i++){
			
			Product p = (Product) list.get(i);

			if(p.cate.equals("HomeAppliances")){
				sum += p.price * (1-HOME_SALE);
			}
			
			if(p.cate.equals("Fashion")){
				sum += p.price * (1-FASHION_SALE);
			}
			
		}

		System.out.println("구매하신 제품 목록");
		for(int i=0; i<length; i++){
			System.out.println(list.get(i));
		}

		System.out.println("총 구매 금액은 "+ sum +"입니다.");

		list.removeAll(list);
		
	}
}
