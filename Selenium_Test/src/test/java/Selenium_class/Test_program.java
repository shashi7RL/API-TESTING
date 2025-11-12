package Selenium_class;

public class Test_program {
	
	public static String reverse_word(String reverseWord ) {
		String word="java is simple program";
		String rev=" ";
		
		for (int i=word.length()-1; i>=0; i--){
			rev =rev+word.charAt(i);
		}
		return rev;
		
		
	}

	public static void main(String[] args) {
		
		String word="java is simple program";
		String[] words=word.split(" ");
		String result ="";
		
		for (int i=0 ; i<words.length;i++) {
			if ((i+1)%2==0) {
				result=result+reverse_word(words[i])+" ";
			}else {
				result=result+words[i]+" ";
				
			}
		}
		
		System.out.println(result);
		
		

	}

}
