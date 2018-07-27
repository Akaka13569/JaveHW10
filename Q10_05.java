/*Q5
���{���|�Ψ�U�C���O�G

public class Cat {
  String name;
  public Cat(String name){
  this.name = name;
  }
  public void smile(){
  System.out.println("Cat=>"+name+":)");
  }
  public void meao(){
  System.out.println("Cat=>"+name+"meaomeao");
  }
}

public class Dog {
  String name;
  public Dog(String name){
  this.name = name;
  }
  public void smile(){
  System.out.println("Dog=>"+name+":)");
  }
  public void meao(){
  System.out.println("Dog=>"+name+"wannwann");
  }
}

�мg�@�{��Q10_05.java�A�д��o������O�Ӳ��ͨ�Ӫ���A�M��N����(�|�Ӫ���)�g��C:\data\ObjectQ10_05.dat���C
�`�N�G���̦��@�Ӧ@����k�Apublic void smile()�C�����ѵ{���P�_C:\data�O�_�s�b�A
�p�GC:\data���s�b�A�Цb�{�����إߦ���Ƨ��C
*/
package CH10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Q10_05 {

	public static void main(String[] args) {
		File f1 = new File("C:\\data", "ObjectQ10_05.dat");
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
			Cat c1 = new Cat("cat1");
			Cat c2 = new Cat("cat2");
			Dog d1 = new Dog("dog1");
			Dog d2 = new Dog("dog2");
			
			oos.writeObject(c1); //���H�U�W�w�аȥ����I!!!!!!!!��
			oos.writeObject(c2); //�n�N����g�i�ɮפ��μg�i�ä[�x�s�˸m �ȥ��n�ǦC�� 
			oos.writeObject(d1); //�ҥH �b Cat Dog�����O������@java.io.Serialazable !!
			oos.writeObject(d2); //���H�W�W�w�аȥ����I!!!!!!!!��
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
