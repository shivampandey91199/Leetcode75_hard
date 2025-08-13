/*
 * Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
Example 2:
Input: s = "leetcode"
Output: "leotcede"
 */
package DSA;
public class VowelsReverse {
	private static String reverseVowels(String str) {
		char[] chrArr = str.toCharArray();
		String Vowels = "aeiouAEIOU";
		int left = 0, right = chrArr.length - 1;
		while (left < right) {
			while (left < right && Vowels.indexOf(chrArr[left]) == -1)
				left++;
			while (left < right && Vowels.indexOf(chrArr[right]) == -1)
				right--;
			char temp = chrArr[left];
			chrArr[left] = chrArr[right];
			chrArr[right] = temp;
			left++;
			right--;
		}
		return new String(chrArr);
	}
	public static void main(String[] args) {
		System.out.println(reverseVowels("IceCreAm"));
	}

}
