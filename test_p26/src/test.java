import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݭn��ܭ������u?");	
		System.out.println("�п�J���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i=1;
		while(i<=5)
		{
			System.out.println("��"+i+"�����j��");
			i++;
		}
		
		System.out.println("�j�鵲��");
		
	}

}