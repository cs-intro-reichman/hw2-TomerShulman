// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String Name = args[0].toUpperCase();
            int Times = Integer.parseInt(args[1]);
            String whenAN = "AEFHILMNORSX";
            int i=0;
            while (i < Name.length()) {
                    if (whenAN.indexOf(Name.charAt(i))!=-1){
                        System.out.println("Give me an "+ Name.charAt(i)+": "+Name.charAt(i)+"!");
                        
                        }
                    else{
                        System.out.println("Give me a "+ Name.charAt(i)+": "+Name.charAt(i)+"!");
                        
                    }
                    i++;
            }
        
            System.out.println("What does that spell?");
            for (int k = 0; k < Times; k++) {
                System.out.println(Name+ "!!!");
            }
        

        }
}
