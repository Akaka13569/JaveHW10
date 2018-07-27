/*Q2
���]��r�� Sample.txt�����e�p�U�G
�����U�b���إ�(�s�D�B�Ϥ��B�ӫ~)�J��ìy�A�Q�B�ʮa�����X�Ⱖ�w���A
���إ��S��X�⦸�O�e�A���襴��4:4�A�v���`���Y����W���A���U���إ��A
�Ѥ��~��ⴵ�S������A�����������襴���A���إ����~���Ĥ@���n�O�A
�T�w�P���ɳӭt�L���C

�B�ʮa�����̦b�K���U���@���r��A�Y�Ϭv�򴫤F�T�����]�פ���A����F�����A
�N��ƩԤj��9:4�C�E���W�v��ϧ�L�O�A�̲׿鱼�o�����ɡC

�мg�@�{��Q10_02.java��Ū�����ɮת����e�A�M���ù��W��ܤU�C�T��:
sample.txt �t�� xxx �Ӧ줸�աA yyy �Ӧr���A mmm �C��ơC
( �n�HFileInputStream�AFileReader�ABufferedReader���O�ӳB�z )
*/
package CH10;

import java.io.*;


public class Q10_02 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("D:\\Sample.txt");
		FileInputStream fis = new FileInputStream(f1);
		
		//sample.txt���줸��
		try {
			int count = 0;
			int y = 0;
			byte[] ba = new byte[8192];
			while ((count = fis.read(ba))!= -1){
				System.out.println(f1 +"�����줸�� = " + count);// y += count ,f1 +"�����r���� = " + count
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//sample.txt���r��
		try(FileReader fr = new FileReader(f1);){
			int count = 0;
			int y = 0;
			char[] ch = new char[8192];
			while ((count = fr.read(ch))!= -1){
				System.out.println(f1 +"�����r�� = " + count);
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//sample.txt���X��
		try(FileReader fr = new FileReader(f1);BufferedReader br = new BufferedReader(fr);){
			int count = 0;
			String s = null;
			while ((s = br.readLine())!= null){
				count ++;
		}
			System.out.println(f1 + "������� = " + count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}