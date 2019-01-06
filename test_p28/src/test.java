import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請問要選擇哪條路線?");	
		System.out.println("請輸入整數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
				System.out.println("i圈是"+i+";j圈是"+j);
		}
		//	System.out.println("第"+i+"次的迴圈");
			
		
		//System.out.println("迴圈結束");
		
	}

}