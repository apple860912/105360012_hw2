import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݧA�O�k�͹�?");	
		System.out.println("�п�JY or N");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
	//	int num = Integer.parseInt(br.readLine());
		
		if (letter =='Y' || letter == 'y')
		{
			System.out.println("boys");
		}
		else if (letter =='N' || letter == 'n')
		{
			System.out.println("girls");
		}
		else
		{
			System.out.println("�п�JY��N");
		}
		
	}

}