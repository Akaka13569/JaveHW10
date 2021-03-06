/*Q2
假設文字檔 Sample.txt的內容如下：
五局下半王建民(新聞、圖片、商品)遇到亂流，被運動家隊擊出兩隻安打，
王建民又投出兩次保送，雙方打成4:4，洋基總教頭托瑞上場，換下王建民，
由中繼投手斯特茲接手，五局結束雙方打平，王建民今年的第一次登板，
確定與比賽勝負無關。

運動家隊打者在八局下的一輪猛攻，即使洋基換了三任投手也擋不住，海灌了五分，
將比數拉大為9:4。九局上洋基反攻無力，最終輸掉這場比賽。

請寫一程式Q10_02.java來讀取此檔案的內容，然後於螢幕上顯示下列訊息:
sample.txt 含有 xxx 個位元組， yyy 個字元， mmm 列資料。
( 要以FileInputStream，FileReader，BufferedReader分別來處理 )
*/
package CH10;

import java.io.*;


public class Q10_02 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("D:\\Sample.txt");
		FileInputStream fis = new FileInputStream(f1);
		
		//sample.txt的位元組
		try {
			int count = 0;
			int y = 0;
			byte[] ba = new byte[8192];
			while ((count = fis.read(ba))!= -1){
				System.out.println(f1 +"全部位元組 = " + count);// y += count ,f1 +"全部字元有 = " + count
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//sample.txt的字元
		try(FileReader fr = new FileReader(f1);){
			int count = 0;
			int y = 0;
			char[] ch = new char[8192];
			while ((count = fr.read(ch))!= -1){
				System.out.println(f1 +"全部字元 = " + count);
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//sample.txt有幾行
		try(FileReader fr = new FileReader(f1);BufferedReader br = new BufferedReader(fr);){
			int count = 0;
			String s = null;
			while ((s = br.readLine())!= null){
				count ++;
		}
			System.out.println(f1 + "全部行數 = " + count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}