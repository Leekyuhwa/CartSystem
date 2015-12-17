package util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Coupang on 2015-12-15.
 */
public class InputUtil {

	private static Scanner scanner = new Scanner(System.in);

	private static int DEFAUILT_INT = 0;

	public static String getInputString() {
		if (!scanner.hasNext()) {
			return null;
		}

		return scanner.next();
	}

	public static int getInputInteger() {
		try {
			return scanner.nextInt();
		} catch (NumberFormatException numberFormatException) {
			return DEFAUILT_INT;
		} catch (InputMismatchException inputMismatchException) {
			return DEFAUILT_INT;
		}
	}

	public static String getInputLine() {
		if (!scanner.hasNextLine()) {
			return null;
		}
		scanner.nextLine();	//Integer String 연속적으로 받을 때 Scanner Buffer에 쓰레기값 존재에 대한 처리 고민중
		return scanner.nextLine();
	}

}
