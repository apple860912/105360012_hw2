import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)");	
		System.out.println("請輸入整數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
	//	char letter = str.charAt(0);
		
		int res = Integer.parseInt(str);
		
		for(int i=1;i<=10;i++)
			{System.out.println("第"+i+"次的處理");
			if(i==res)
				break;
			}
	}

}