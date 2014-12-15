
public class UseStudent {

	public static void main(String[] args) {

		FullTime student1 = new FullTime("Herp");
		PartTime student2 = new PartTime("Derp");
		
		System.out.println(student1.name + "'s tuition is " + student1.calcTuition(15));
		System.out.println(student2.name + "'s tuition is " + student2.calcTuition(12));
	}

}
