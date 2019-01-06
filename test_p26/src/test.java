import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請問要選擇哪條路線?");	
		System.out.println("請輸入整數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i=1;
		while(i<=5)
		{
			System.out.println("第"+i+"次的迴圈");
			i++;
		}
		
		System.out.println("迴圈結束");
		
	}

}