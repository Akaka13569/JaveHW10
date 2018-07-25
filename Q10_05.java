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

public class Q10_05 {

	public static void main(String[] args) {
		File f1 = new File("D:\\Object.dat");
		
		System.out.println(f1 + " ,檔案的大小:" + f1.length());
	}

}
