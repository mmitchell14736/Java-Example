
public class PartTime extends Student {

	public PartTime(String name) {
		super(name, false);
	}

	@Override
	public int calcTuition(int crHr) {
		
		return crHr * 200;
	}

}
