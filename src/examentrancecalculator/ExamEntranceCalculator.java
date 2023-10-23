/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examentrancecalculator;
import java.util.Scanner;
/**
 *
 * @author brett
 */
public class ExamEntranceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner moduleNameInput = new Scanner(System.in); //Create Scanner Object
        System.out.print("Enter the module name (JD521, PRG521, SLD521): "); //Prompt user to enter the module's name
        String moduleName = moduleNameInput.nextLine(); //Save input to a string variable
        String moduleNameUpper = moduleName.toUpperCase(); //Set string variable to uppercase
        
        while(!moduleNameUpper.equals("JD521") && !moduleNameUpper.equals("PRG521") && !moduleNameUpper.equals("SLD521")) //While the user enters an invalid value...
        {
            System.out.println("\nEnter a valid module name"); //Error message
            System.out.print("Enter the module name (JD521, PRG521, SLD521): "); //Prompt user to re-enter
            moduleName = moduleNameInput.nextLine(); //Save input to a string variable
            moduleNameUpper = moduleName.toUpperCase(); //Set string variable to uppercase
        }
        
        if (moduleNameUpper.equals("JD521") || moduleNameUpper.equals("PRG521") || moduleNameUpper.equals("SLD521") ) //If the input is valid...
        {
            Scanner FA1input = new Scanner(System.in); //Create Scanner Object
            System.out.print("\nEnter your mark for FA1 out of 100: "); //Enter mark for FA1
            double FA1score = Double.parseDouble(FA1input.nextLine()); //Save input to a double variable
            double FA1 = FA1score/100 * 16.66; //Calculations
            
            Scanner FA2input = new Scanner(System.in); //Create Scanner Object
            System.out.print("Enter your mark for FA2 out of 100: "); //Enter mark for FA2
            double FA2score = Double.parseDouble(FA2input.nextLine()); //Save input to a double variable
            double FA2 = FA2score/100 * 16.66; //Calculations
            
            Scanner FA3input = new Scanner(System.in); //Create Scanner Object
            System.out.print("Enter your mark for FA3 out of 100: "); //Enter mark for FA3
            double FA3score = Double.parseDouble(FA3input.nextLine()); //Save input to a double variable
            double FA3 = FA3score/100 * 16.66; //Calculations
            
            double finalMark = FA1 + FA2 + FA3; //Add all FA marks together and save to double variable
            if (finalMark > 30) //If the finalMark variable is more than 30...
            {
                System.out.println("\nCongratulations! You have qualified to write an exam!"); //Message states that you passed
            }
            else //If not...
            {
                System.out.println("\nYou did not meet the qualifying criteria, you have failed your module."); //Message states that you failed
            }
        }
    }
}
