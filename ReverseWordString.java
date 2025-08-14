package DSA;

public class ReverseWordString {

	 public static void main(String[] args) {
  String s="the sky is blue";
		 reverseWord(s); 	
	}

	private static void reverseWord(String s) {
		String[] wordArr=s.split(" ");
		 StringBuilder builder = new StringBuilder();
		for(int i=wordArr.length-1;i>=0;i--) {
			builder.append(wordArr[i]+" ");
		}
		
		String str=builder.toString();
		str=str.trim().replace("//s+", " ");
		System.out.println(str);
	}
	
	
}
