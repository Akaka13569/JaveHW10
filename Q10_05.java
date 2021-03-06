/*Q5
本程式會用到下列類別：

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

請寫一程式Q10_05.java，請替這兩個類別個產生兩個物件，然後將它們(四個物件)寫至C:\data\ObjectQ10_05.dat內。
注意：它們有一個共有方法，public void smile()。必須由程式判斷C:\data是否存在，
如果C:\data不存在，請在程式內建立此資料夾。
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
			
			oos.writeObject(c1); //※以下規定請務必死背!!!!!!!!※
			oos.writeObject(c2); //要將物件寫進檔案內或寫進永久儲存裝置 務必要序列化 
			oos.writeObject(d1); //所以 在 Cat Dog的類別都有實作java.io.Serialazable !!
			oos.writeObject(d2); //※以上規定請務必死背!!!!!!!!※
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
