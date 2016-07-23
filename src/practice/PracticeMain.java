package practice;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1= 50;
		int n2 =  2;
		PracticeSubclass p = new PracticeSubclass();
		
		System.out.println(p.add(n1,n2));
		System.out.println(p.subtract(n1,n2));
		System.out.println(p.mul(n1,n2));
//		System.out.println(p.div(n1,n2));
	}

}
