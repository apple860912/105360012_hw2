import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		System.out.println("�п�J���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		switch (num)
		{
		case 1:
		{
			System.out.println("��J���O1");
			break;
		}
		case 2:
		{
			System.out.println("��J���O2");
			break;
		}	
		default:
		{
			System.out.println("�п�J1��2");
		}
		}
		
	}

}