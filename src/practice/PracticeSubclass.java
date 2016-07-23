package practice;

public class PracticeSubclass extends PracticeAbstract implements PracticeInterface {

//	public int add(int c, int d){
//		return c-d;
//	}
	
	public int subtract(int a, int b){
		return a-b;
	}
	
	public double mul(int a, int b){
		return a*b;
	}
}
