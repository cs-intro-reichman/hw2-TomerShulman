// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int HigherNum =Integer.parseInt(args[0]);
		String Mode = args[1];
		int Last;
		int count=1;
		for (int seed = 1; seed < HigherNum+1; seed++) {
			Last=seed;
			if(Mode.equals("v")==true){
			System.out.print(Last);
			}
			if (seed==1){
				Last= Last*3+1;
				if(Mode.equals("v")==true){
				System.out.print(", "+Last);
				}
				count++;
			}
			while(Last != 1){
				if(Last%2==0){
					Last /= 2;
					if(Mode.equals("v")==true){
					System.out.print(", "+Last);
					}
					count++;
				}
				else{
					Last= Last*3+1;
					if(Mode.equals("v")==true){
					System.out.print(", "+Last);
					}
					count++;
				}
			}
				if(Mode.equals("v")==true){
				System.out.println(" ("+count+")");
				}
				count=1;
			}
			System.out.println("Every one of the first "+ HigherNum+" hailstone sequences reached 1.");
		}

	}
