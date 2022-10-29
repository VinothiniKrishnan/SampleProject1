package arrayTest;

public class TwoDimentionalTest {

	public static void main(String[] args) {
int [][] a=new int [3][3];
a[0][0]=100;
a[0][1]=200;
a[0][2]=300;
a[1][0]=400;
a[1][1]=500;
a[1][2]=600;
a[2][0]=700;
a[2][1]=800;
a[2][2]=900;
for(int row=0; row<a.length; row++){
	for(int col=0; col<a[row].length; col++){
		System.out.print(a[row][col] + "  ");
		
	}
	System.out.println();
}
	}

}
