package arithmetic_and_relational;

public class logical {

	public static void main(String[] args) {
		
		
	 boolean check = 4 <= 6;
		 
		System.out.println(check && 5 > 3 || !(10 == 10));
		System.out.println(20 != 20 || check && 7 > 2);
		System.out.println(15 > 10 && 5 == 5 || false);
	    System.out.println(!check || 8 >= 8 && 3 < 2);
	    System.out.println(false || true && 10 > 5 || !(4 == 4));
	    System.out.println(25 >= 20 && check || 6 != 6);
	    System.out.println(!(12 > 15) && 4 <= 4 || false);
	    System.out.println(check || false && 9 < 3 || !(5 != 5));
	    System.out.println(30 < 20 || (8 > 5 && 6 == 6) && check);
	    System.out.println(!(7 >= 7) || false && check || 12 != 10);
	}

}
