/*Q1
請寫意程式Q10_01.java，能讀入一檔案然後於螢幕上顯示他有多少個位元組
*/
package CH10;

import java.io.File;

public class Q10_01 {

	public static void main(String[] args) {
		File f1 = new File("D:\\Sample.txt");
		
		System.out.println(f1 + " ,檔案的大小:" + f1.length());
	}

}
