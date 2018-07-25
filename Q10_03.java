/*Q3
請寫一程式Q10_03.java，在程式內

    請將浮點數17.625以ObjectOutputStream類別的writeDouble()將其寫至檔案上C:\data\DataQ10_03.txt。
    需要判斷C:\data\是否存在，如果不存在，程式必須建立。
    關檔後，再以ObjectInputStream類別的readDouble()讀回，顯示在螢幕上。
    提示：會用到類別有FileOutputStream、ObjectOutputStream、FileInputStream、ObjectInputStream等類別。
*/
package CH10;

import java.io.File;

public class Q10_03 {

	public static void main(String[] args) {
		File f1 = new File("D:\\Object.dat");
		
		System.out.println(f1 + " ,檔案的大小:" + f1.length());
	}

}
