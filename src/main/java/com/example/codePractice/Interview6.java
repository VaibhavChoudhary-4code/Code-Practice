package com.example.codePractice;

public class Interview6 {

	public static void main(String[] args) {

//		input: abc{def}ghijkl{mnop}qrst
//		output: abc{fed}ghijkl{ponm}qrst
		
		
		String s = "abc{def}ghijkl{mnop}qrst";
		
//		String[] arr = s.split("[\\{}]");
		
// { -> split -> abc def -> def StringBuilder.reverse -> 
		
		StringBuilder reverse = new StringBuilder();
		StringBuilder curlyBraces = new StringBuilder();
		Boolean flag = false;
		
		for(char c : s.toCharArray()) {
			
			if(c == '{') {
				flag = true;
				continue;
			} else if(c == '}') {
				flag = false;
				reverse.append("{"+curlyBraces.reverse());
				curlyBraces.setLength(0);
			}

			if(flag) {
				curlyBraces.append(c);
			} else {
				reverse.append(c);
			}	
		}
		System.out.println(reverse.toString());
		
	}

}
