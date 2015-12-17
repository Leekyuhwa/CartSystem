package controller;

public abstract class BaseController<T> {
	public abstract void execute();

	protected abstract void checkInputValue(T value);

	protected abstract boolean inputMenu();
}
