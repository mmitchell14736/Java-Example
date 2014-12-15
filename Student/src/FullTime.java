
public class FullTime extends Student {

	public FullTime(String name) {
		super(name, true);
	}

	@Override
	public int calcTuition(int crHr) {
		
		return 2000;
	}

}
