public class TimeCalc {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minites = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd =Integer.parseInt(args[1]);
        int totalminites = minites+ minutesToAdd+ (hours*60);
        int Totalhours= totalminites/60;
        int newhours = Totalhours%24;
        int newminites = totalminites-(Totalhours*60);
        if(newhours<10){
            if(newminites<10){
                System.out.println("0"+newhours+":"+"0"+newminites);
            }
            System.out.println("0"+newhours+":"+newminites);
        }
        else if (newminites<10) {
            System.out.println(newhours+":"+"0"+newminites);            
        }
        else{
           System.out.println(newhours+":"+newminites); 
        }


    }
}
