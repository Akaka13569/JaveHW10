/*Q3
�мg�@�{��Q10_03.java�A�b�{����

    �бN�B�I��17.625�HObjectOutputStream���O��writeDouble()�N��g���ɮפWC:\data\DataQ10_03.txt�C
    �ݭn�P�_C:\data\�O�_�s�b�A�p�G���s�b�A�{�������إߡC
    ���ɫ�A�A�HObjectInputStream���O��readDouble()Ū�^�A��ܦb�ù��W�C
    ���ܡG�|�Ψ����O��FileOutputStream�BObjectOutputStream�BFileInputStream�BObjectInputStream�����O�C
*/
package CH10;

import java.io.File;

public class Q10_03 {

	public static void main(String[] args) {
		File f1 = new File("D:\\Object.dat");
		
		System.out.println(f1 + " ,�ɮת��j�p:" + f1.length());
	}

}
