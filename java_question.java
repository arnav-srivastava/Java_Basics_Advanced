public class java_question {
//     Q1) Write a program to create a class named shape. It should contain 2 methods, draw() and erase() 
//  that prints “Drawing Shape” and “Erasing Shape” respectively.

void draw(){
    System.out.println("Drawing Shape");
}

void erase(){
    System.out.println("Erasing Shape");
}
public static void main(String[] args) {
    java_question con = new java_question();
    con.draw();
    con.erase();
    
}

}

// Q2) Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. 
// The following are the details.
// Name of the class - Patient
// Member Variables - patientName(String),height(double),width(double)
// Member Function - double computeBMI()
// The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ 
// height*height(in metres).
// Create an object of the Patient class and check the results.


// Q3) Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage 
// of interest based on the given conditions.

// If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

// If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

// If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

// If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.



// Q4) Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 

// Example1)
// If the two command line arguments are GLA and Mathura then the output generated should be GLA University Mathura.

// Example2)
// If the command line arguments are AAA and Delhi then the output generated should be AAA Technologies Delhi 

// [Note: It is mandatory to pass two arguments in command line]





// Q5) Write a Program to accept a String as a command line argument and print a Welcome message as given below.

// Example1)
// C:\> java Sample Aman
// O/P Expected : Welcome Aman
// Note: save this file with Sample.java 



// Q6) Write a Program to accept two integers as command line arguments and print the sum of the two numbers

// Example1)
// C:\>java filename 10 20
// O/P Expected : The sum of 10 and 20 is 30


// Q7) Write a program to check if the program has received command line arguments or not.

// If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)

// Example1) java Example
// O/P: No values

// Example2) java Example Mumbai Bangalore
// O/P: Mumbai,Bangalore

// [Hint: You can use length property of an array to check its length]




// Q8) Write a program that finds the tens digit in a non-negative integer N (0 ≤ N ≤ 1000000).
// Take a look at the examples:
// If N is 264, the tens digit is 6.

// If N is 4136, the tens digit is 3.

// If N is 101, the tens digit is 0.
// Report a typo
// Sample Input 1:
// 173
// Sample Output 1:
// 7

// }
