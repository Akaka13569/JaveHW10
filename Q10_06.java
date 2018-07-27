/*Q6
�ӫe�@�D�A�мg�@�{��Q10_06.java�A��C:\data\ObjectQ10_05.dat��Ū���e�@�D�Ҽg�J���|�Ӫ���A
�M����楦�̪�smile()�A�ХΦh����²�Ƶ{�����]�p�C(�]�N�O���A�A�n�]�p�@�Ӥ����O)�A
�pMammal�A�b�䤺�w�q�@����k�A�M��̷����q�ҦC���B�J�Ӽ��g)�C
*/
package CH10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q10_06 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\data", "ObjectQ10_05.dat");
		Object o = null;
		Mammal m = null;
		try (FileInputStream fis = new FileInputStream(f1); ObjectInputStream ois = new ObjectInputStream(fis);) {
			while (true) { //true�u�O���F�n���j��]�_��! 
				try {
					o = ois.readObject();
					if (o instanceof Mammal) {
						m = (Mammal) o;
						m.smile();
					}
				} catch (ClassNotFoundException e) {
					break;
				}
			}

		} catch (IOException e) {
			System.out.println("end");
			;
		}
	}

}
