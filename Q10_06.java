/*Q6
承前一題，請寫一程式Q10_06.java，由C:\data\ObjectQ10_05.dat內讀取前一題所寫入的四個物件，
然後執行它們的smile()，請用多型來簡化程式的設計。(也就是說，你要設計一個父類別)，
如Mammal，在其內定義共有方法，然後依照講義所列的步驟來撰寫)。
*/
package CH10;

import java.io.File;

public class Q10_06 {

	public static void main(String[] args) {
		File f1 = new File("D:\\Object.dat");
		
		System.out.println(f1 + " ,檔案的大小:" + f1.length());
	}

}
