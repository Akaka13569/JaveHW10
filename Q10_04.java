/*Q4
�мg�@�{��Q10_04.java�A

    �бN�Q�Ӿ�ƶü�(1-1000)�HDataOutputStream���O��writeInt()�N��g���ɮפWC:\data\DataQ10_04.txt�A���L�n�H�u���[�Ҧ�(Append)�g�X�v�C�ݭn�P�_C:\data\�O�_�s�b�A�p�G���s�b�A�{�������إߡC
    �HDataOutputStream���O��readInt()Ū�^C:\data\DataQ10_04.txt�ɮפ�����ƶüơA�M����ܦb�ù��W�C�O�o�h���մX���A�[��u���[�Ҧ��v���ĪG�CDataOutputStream���O�SwriteInt(int n)�i�H�g�X�@�Ӿ�ơCDataOutputStream���O��readInt()�i�HŪ�J�@�Ӿ�ơC

*/
package CH10;

import java.io.File;

public class Q10_04 {

	public static void main(String[] args) {
		File f1 = new File("D:\\Object.dat");
		
		System.out.println(f1 + " ,�ɮת��j�p:" + f1.length());
	}

}
