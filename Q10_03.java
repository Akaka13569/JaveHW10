/*Q3
�мg�@�{��Q10_03.java�A�b�{����

  (1)�бN�B�I��17.625�HObjectOutputStream���O��o�N��g���ɮפWC:\data\DataQ10_03.txt�C
     �ݭn�P�_C:\data\�O�_�s�b�A�p�G���s�b�A�{�������إߡC
  (2)���ɫ�A�A�HObjectInputStream���O��readDouble()Ū�^�A��ܦb�ù��W�C
      ���ܡG�|�Ψ����O��FileOutputStream�BObjectOutputStream�BFileInputStream�BObjectInputStream�����O�C
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
