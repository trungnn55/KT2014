
public class ptbac2 {
	protected int a, b, c;
	protected double x1;
	protected double x2;
	
	double getX1(){
		return x1;
	}
	double getX2(){
		return x2;
	}
	
	public ptbac2(int isA, int isB, int isC){
		this.a = isA;
		this.b = isB;
		this.c = isC;
	}
	
	public int giaiptbac2(){
		float delta = b*b - 4*a*c;	
		if (delta < 0)
			return 0;
		else if (delta == 0){
			x1 = x2 = -b/(2*a);
			return 1;
		}
		else{
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
			return 2;
		}
	}

}
