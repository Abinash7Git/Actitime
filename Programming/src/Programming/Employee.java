package Programming;

public interface Employee {
	public void eat();
	default int earn() {
		return 4000;
	}

}
