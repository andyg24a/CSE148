package string;

public class Demo2 {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toUpperCase().charAt(0));
		
		System.out.println(str.substring(2, 4));
		
		String name = "John A. Doe";
		System.out.println(name.charAt(name.indexOf(".")-1));
		System.out.println(name.lastIndexOf("o"));
		System.out.println(name.indexOf("Z"));
		
		char[] letters = name.toCharArray();
		
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] +", ");
		}
	}

}