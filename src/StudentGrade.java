/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class generates a random number between 50-100, 
 * which will print out to the console. 
 *
 * @author micah
 */
public class StudentGrade {
    public static void main(String [] args) {        
        for(short i=0; i<5; i++){
            /*
            * int grade has to be casted as an int because the Math.random()
            * returns a random double between 0 and 1. 
            */
            
            /**
            * byte(1 byte) = Very short integers from -128 to 128
            * short(2 bytes) = Short integers from -32,768 to 32,767
            * int (4 bytes) = Integers from -2,147,483,648 to 2,147,483,647
            * long (8 bytes) = Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            * float (4 bytes) = Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits 
            * double (8 bytes) = Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
            * char (2 bytes) = A single Unicode character that's stored in two-bytes.
            * boolean (1 byte) = A true or false value.
            * 
            * Utilizing the appropriate data type will conserve memory resources. 
            */
            int grade =(int)(Math.random()*100);
            if (grade >=90){
                System.out.println("Student grade is " + grade+" which is A.");
            } else if (grade >=80 && grade <90) {
                System.out.println("Student grade is " + grade+" which is B.");
            } else if (grade >=70 && grade <80) {
                System.out.println("Student grade is " + grade+" which is C.");
            } else if (grade >=60 && grade <70) {
                System.out.println("Student grade is " + grade+" which is D.");
            } else {
                System.out.println("Student grade is " + grade+" which is F.");
            }
        }       
    }   
}
