import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݭn��ܭ������u?");	
		System.out.println("�п�J���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
				System.out.println("i��O"+i+";j��O"+j);
		}
		//	System.out.println("��"+i+"�����j��");
			
		
		//System.out.println("�j�鵲��");
		
	}

}