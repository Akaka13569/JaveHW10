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

public class Q10_05 {

	public static void main(String[] args) {
		File f1 = new File("D:\\Object.dat");
		
		System.out.println(f1 + " ,�ɮת��j�p:" + f1.length());
	}

}
