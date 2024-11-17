// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
    int numterms = Integer.parseInt(args[0]);
	double sum = 1.0 ;
	double j=3.0 ;
	System.out.println("pi according to Java: "+ Math.PI);
	if (numterms==0) {
		System.out.println("pi, approximated: "+ 0);
	}
	else{
	for (int i = 1; i < numterms; i++) {
		if (i%2==0){
			sum+=(1.0/j);
		}
		else{
			sum-= (1.0/j);
		}
		j+=2;
	}	
	System.out.println("pi, approximated: "+sum*4);
	}
	}
}
