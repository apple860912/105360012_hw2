import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݭn��ܭ������u?");	
		System.out.println("�п�J���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
	//	char letter = str.charAt(0);
		
		int res = Integer.parseInt(str);
		
		char ans = (res == 1)?'A':'B';
		System.out.println("��ܤF"+ans+"���u");
		
	}

}