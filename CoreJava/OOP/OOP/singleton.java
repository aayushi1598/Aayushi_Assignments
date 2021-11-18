package OOP;

public final class singleton {
	private singleton() {
	}

	public static final singleton s = new singleton();

	public static singleton match() {
		return s;
	}

}