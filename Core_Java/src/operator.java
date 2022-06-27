
public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic
	    System.out.println("Arithmetic Operators");
	    System.out.println(5+2);
	    System.out.println(5-2);
	    System.out.println(5*2);
	    System.out.println(5%2);
	    System.out.println(5/2);
	    System.out.println(5/2.0);
	    System.out.println(5.0/2.0);
	    
	    //implicit explicit typecasting
	    System.out.println("implicit explicit typecasting");
	    //float a=4; //implicit
	    int c = (int)4.0; //explicit
	    System.out.println(c);
	    System.out.println((float)5/2); //5.0/2
	    
	    //Realtional Operators
	    System.out.println("Realtional Operators");
	    System.out.println(5<6);
	    System.out.println(5>6);
	    
	    
	    //Assignment opeartor
	    System.out.println("Assignment opeartor");
	    float a=4; //implicit
	    int b = (int)4.0; //explicit
	    System.out.println(a+=b);
	    System.out.println(a-=b);
	    System.out.println(a*=b);
	    System.out.println(a/=b);
	    
	    //Logical operator
	    System.out.println("Logical operator");
	    System.out.println(a>6 && 6!=b);
	    
	    //bitwise opeartor
	    System.out.println("bitwise opeartor");
	    System.out.println(b & 6);//4&6 0100 & 0110 = 0100 = 4
	    System.out.println(b | 6);//4|8 0100 | 1000 = 1100 = 6
	    System.out.println(~ 6);// ~6 = ~100 = 011 = 3
	    
	    
	    /*
	    * int -> 4bytes = 32 bits
	    * b=4=   0000 0000 0000 0000 0000 0000 0000 0100  +
	    * ~b =   1111 1111 1111 1111 1111 1111 1111 1011  -
	    * MBS sign
	    * -ve -> 1111 1111 1111 1111 1111 1111 1111 1011  -?
	    * 	     0000 0000 0000 0000 0000 0000 0000 1011
	    *        									 + 1
	    *        0000 0000 0000 0000 0000 0000 0000 1010  5 
	    */
	    
	    //Unary Operator
	    System.out.println("Unary Operator");
	    int d =4; //implicit
	    System.out.println(++d);
	    System.out.println(--d);
	    System.out.println(d++);
	    System.out.println(d--);
	    System.out.println(+d);
	    System.out.println(-d);
	  }
	}