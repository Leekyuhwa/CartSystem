package controller;

/**
 * Created by Coupang on 2015-12-15.
 */
public abstract class BaseController<T> {
	public abstract void execute();
	protected abstract void checkInputValue(T value);
	protected abstract boolean inputMenu();
}
