
public class triangle {
    protected float a, b, c;
    
    public triangle(float isA, float isB, float isC){
    	this.a = isA;
    	this.b = isB;
    	this.c = isC;
    }
    
    public boolean checkTriangle(){
        if((a < (b + c)) && (b < (a+c)) && (c < (b+a)))
            return true;
        else
            return false;
    }
   public String isTriangle(){
	   if (checkTriangle() &&( a == b || b == c || c == a)){
		  return "Tam giac can";
	   		
	   }
	   else if (checkTriangle() &&( a*a == (b*b + c*c) || (b*b == (c*c + a*a)) || (c*c == (a*a + b*b))))
		   return "Tam giac vuong";
	   else 
		   return "Tam giac thuong";
   }
    public static void main(String args[]){
        triangle tri = new triangle(3,3,5);
        System.out.println(tri.checkTriangle());
        System.out.println(tri.isTriangle());
        
    }
}

