// Name statistics.java
//Written ny: Arturo Montiel 
//Written on: Java
//Purpose: Create a progrgam that will give your statics once you plug in the number 

public class statistics{
    public static void main (String[] args){

        //Open keyboard
        Scanner keyboard = new Scanner (System.in);

        //Print a nice title 
        System.out.println("+================+");
        System.out.println("Basebal statistics");
        System.out.println("+================+");

        

        //Get the input from the user 
        System.out.print("Enter number of ABs: ");
        int ABs = keyboard.nextInt();
        System.out.print("Enter number of hits: ");
        int hits = keyboard.nextInt();

        //Make the calculations
        double ave = ABs / hits ;

        //Print results 
        System.out.printf("Your average is: $%,.2f\n", ave );

        //Close keyboard 
        keyboard.close();
    }
}
