/*Q4
�мg�@�{��Q10_04.java�A

    �бN�Q�Ӿ�ƶü�(1-1000)�HDataOutputStream���O��writeInt()�N��g���ɮפWC:\data\DataQ10_04.txt�A
    ���L�n�H�u���[�Ҧ�(Append)�g�X�v�C�ݭn�P�_C:\data\�O�_�s�b�A�p�G���s�b�A�{�������إߡC
    �HDataOutputStream���O��readInt()Ū�^C:\data\DataQ10_04.txt�ɮפ�����ƶüơA�M����ܦb�ù��W�C
    �O�o�h���մX���A�[��u���[�Ҧ��v���ĪG�C
  DataOutputStream���O�SwriteInt(int n)�i�H�g�X�@�Ӿ�ơC
  DataOutputStream���O��readInt()�i�HŪ�J�@�Ӿ�ơC

*/
package CH10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Q10_04 {

	public static void main(String[] args) {
		File f1 = new File("C:\\data", "DataQ10_04.txt");
		if (!f1.exists()) {
			f1.getParentFile().mkdirs();
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try (FileOutputStream fos = new FileOutputStream(f1, true); DataOutputStream dos = new DataOutputStream(fos);) {
			for (int x = 1; x <= 10; x++) {
				int y = (int) (Math.random() * 1000) + 1;
				dos.writeInt(y);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream(f1); DataInputStream dis = new DataInputStream(fis);) {
			int x=0;
			while(x<10) {
				System.out.println(dis.readInt());
				x++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
