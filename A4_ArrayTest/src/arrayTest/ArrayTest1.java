package arrayTest;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= new int[5];
 // a.length array size
 // a.clone()  array copy
a[0]=100;
a[1]=200;
a[2]=300;
a[3]=400;
a[4]=500;
System.out.println(a[0]);
System.out.println(a);
System.out.println(a.length);
for(int i=0; i<a.length; i++){
	System.out.println(a[i]);
	
}
	}

}
