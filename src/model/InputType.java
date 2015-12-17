package model;

import java.util.HashMap;
import java.util.Map;

public enum InputType {
	NONE(0),
	PURCHASE_ADD(1),
	PURCHASE_LIST_SELECT(2),
	PURCHASE_LIST_DELETE(3),
	PURCHASE_LIST_ORDER(4),
	PROGRAM_EXIT(5);

	private int type;
	private static Map<Integer, InputType> lookup = new HashMap<>();

	static {
		for (InputType inputType : InputType.values()) {
			lookup.put(inputType.type, inputType);
		}
	}

	InputType (int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public static InputType findInputType(Integer type) {
		return type == null || lookup.get(type) == null ? InputType.NONE : lookup.get(type);
	}
}
