/*Q3
請寫一程式Q10_03.java，在程式內

  (1)請將浮點數17.625以ObjectOutputStream類別的o將其寫至檔案上C:\data\DataQ10_03.txt。
     需要判斷C:\data\是否存在，如果不存在，程式必須建立。
  (2)關檔後，再以ObjectInputStream類別的readDouble()讀回，顯示在螢幕上。
      提示：會用到類別有FileOutputStream、ObjectOutputStream、FileInputStream、ObjectInputStream等類別。
*/
package CH10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Q10_03 {

	public static void main(String[] args) {
		File f1 = new File("C:\\data", "DataQ10_03.txt");
		if (!f1.exists()) {
			f1.getParentFile().mkdirs();
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try (FileOutputStream fos = new FileOutputStream(f1); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeDouble(17.625);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (FileInputStream fos = new FileInputStream(f1); ObjectInputStream ois = new ObjectInputStream(fos);) {
			System.out.println(ois.readDouble());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
