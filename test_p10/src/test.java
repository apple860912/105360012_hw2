import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		System.out.println("�п�J���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if (num ==1)
		{
			System.out.println("��J���O1");
		}
		else
		{
			System.out.println("�諸�O1�H�~���Ʀr");	
		}
		
	}

}