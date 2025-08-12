package week2.day1;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * 1)declare the string
		 * 2)to chararray
		 * 3)for loop
		 */
		String str="saranya";//length-->7(starts from 1)
		char[] charArray = str.toCharArray();//s,a,r,a,n,y,a
		for (int i =charArray.length-1; i>=0 ; i--) {
			System.out.println(charArray[i]);
			
		}
	}

}
