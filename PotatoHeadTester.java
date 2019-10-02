
public class PotatoHeadTester {

	public static void main(String[] args) {
		PotatoHead taterFace = new PotatoHead();
		System.out.println(taterFace.toString());
		/*
		 Mutator methods
		 */
		taterFace.setEyeColor("Red");
		taterFace.setNumbOfArms(4);
		/*
		 Accessor Methods
		 */
		System.out.println(taterFace.getEyeColor());
		System.out.println(taterFace.getNumbOfArms());
		/*
		 toString() Method
		 */
		System.out.println(taterFace.toString());
	}

}
