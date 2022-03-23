package LambdaExpression;

public class LambdaExpression {

	public static void main(String[] args) {
		
		
		Addable addable=(a,b)->(a+b);
		System.out.println("Addition = "+addable.add(3,5));

	}

}
