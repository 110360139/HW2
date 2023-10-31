package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p32 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		System.out.println("請問要在第幾次結束迴圈(0~10)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<=10;i++) {
			System.out.println("第"+i+"次處理");
			if(i==num) {
				break;
			}
		}
		
	}

}
