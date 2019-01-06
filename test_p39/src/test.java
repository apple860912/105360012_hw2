import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int []test;
		test=new int[5];
		
		test[0]=80;
		test[1]=60;
		test[2]=22;
		test[3]=50;
		test[4]=75;
		
		//int res = Integer.parseInt(str);
		
		for(int i=0;i<5;i++)
			
			{
			
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
			
			}
	}

}