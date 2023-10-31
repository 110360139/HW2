package hw2;

public class p49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]test;
		test = new int[2][5];
		test[0][0]=80;
		test[0][1]=81;
		test[0][2]=82;
		test[0][3]=2;
		test[0][4]=75;
		test[1][0]=72;
		test[1][1]=33;
		test[1][2]=57;
		test[1][3]=03;
		test[1][4]=27;
		
		
		
		for(int i=0;i<test[1].length;i++) {
			System.out.println("第"+(i+1)+"個人的數學分數是"+test[1][i]+"分");
			System.out.println("第"+(i+1)+"個人的國語分數是"+test[0][i]+"分");
		}
	}

}
