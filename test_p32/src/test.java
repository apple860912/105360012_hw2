import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݭn�b�ĴX���B�z�����j��O?(1~10)");	
		System.out.println("�п�J���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
	//	char letter = str.charAt(0);
		
		int res = Integer.parseInt(str);
		
		for(int i=1;i<=10;i++)
			{System.out.println("��"+i+"�����B�z");
			if(i==res)
				break;
			}
	}

}