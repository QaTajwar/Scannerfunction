package learnjava2;

//Scanner function


import java.util.Scanner;

public class Learnjava2 {

public static void main(String[]args){

	Scanner scanner = new Scanner(System.in); 
	

	System.out.println("What is your name?");
    String name = scanner.nextLine();
    
    System.out.println("How old are you?");
    int age = scanner.nextInt();
    scanner.nextLine();
    
    System.out.println("What is your favourite food?");
    String food = scanner.nextLine();
    
    System.out.println("Where are you from?");
    String address = scanner.nextLine();
   
    System.out.println("Hello "+name);
    System.out.println("You are "+age+" year's old");
    System.out.println("You like "+food);
    System.out.println("You're from "+address);









}
}
