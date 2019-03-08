
public class A {
int a=10;
String z="pankaj";
public void display(){
	System.out.printf("details \n");
	
}
public static void main(String[] args) {
	A o=new A();
	o.display();
	o.a=9;
	o.z="laxmi";
	System.out.println(o.a);
	System.out.println(o.z);
	
	
}
}
