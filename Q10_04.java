/*Q4
請寫一程式Q10_04.java，

    請將十個整數亂數(1-1000)以DataOutputStream類別的writeInt()將其寫至檔案上C:\data\DataQ10_04.txt，不過要以「附加模式(Append)寫出」。需要判斷C:\data\是否存在，如果不存在，程式必須建立。
    以DataOutputStream類別的readInt()讀回C:\data\DataQ10_04.txt檔案內的整數亂數，然後顯示在螢幕上。記得多測試幾次，觀察「附加模式」的效果。DataOutputStream類別又writeInt(int n)可以寫出一個整數。DataOutputStream類別有readInt()可以讀入一個整數。

*/
package CH10;

import java.io.File;

public class Q10_04 {

	public static void main(String[] args) {
		File f1 = new File("D:\\Object.dat");
		
		System.out.println(f1 + " ,檔案的大小:" + f1.length());
	}

}
