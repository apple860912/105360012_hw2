import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請問要選擇哪條路線?");	
		System.out.println("請輸入整數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
	//	char letter = str.charAt(0);
		
		int res = Integer.parseInt(str);
		
		char ans = (res == 1)?'A':'B';
		System.out.println("選擇了"+ans+"路線");
		
	}

}