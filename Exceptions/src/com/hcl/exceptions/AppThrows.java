package com.hcl.exceptions;

class TestThrows {  
    public static int divideNum(int m, int n) throws ArithmeticException {  
    int div = m / n;  
    return div;  
}  
}
public class AppThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrows obj = new TestThrows();  
        try {  
            System.out.println(obj.divideNum(45, 0));  
        }  
        catch (ArithmeticException e){  
            System.out.println("\nNumber cannot be divided by 0");  
        }  
          
        System.out.println("Rest of the code..");  
	}

}
