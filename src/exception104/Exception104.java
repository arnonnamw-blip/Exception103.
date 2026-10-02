/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception104;

/**
 *
 * @author cis39
 */
public class Exception104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            System.out.println("Input String = " + args[0]);
            System.out.println("Computing Result = " + Integer.parseInt(args[1]) / Integer.parseInt(args[2]));
        }
        catch(NumberFormatException e) {
            System.out.println("Error Number Type argument");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Number of argument");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
