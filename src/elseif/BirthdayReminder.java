
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";
		String mom = "mom";
		String dad = "dad";
		String me = "me";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String question1 = JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(question1);
		// 4. if user asked for "mom"
		if(question1.equalsIgnoreCase(mom)) {
		System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if(question1.equalsIgnoreCase(dad)) {
			System.out.println(dadsBirthday);
			}
		else if(question1.equalsIgnoreCase(me)) {
			System.out.println(myBirthday);
			}
		else {
			System.out.println("Sorry, I don't remember that person's birthday!");
		}
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
