package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Sunday always comes too late.");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "I don't care if Monday's blue. Monday you can fall apart. I don't care if Monday's black. Monday you can hold your head.");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Tuesday's great. Tuesday breaks my heart. Tuesday's hard to take. Tuesday stay in bed.");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "and Wednesday too. Wednesday breaks my heart. Wednesday's hard to take. Wednesday stay in bed.");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Thursday I don't care about you. Thursday doesn't even start. Thursday never looking back. Thursday watch the walls and stare.");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "It's Friday I'm in love");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Saturday, wait.");
			break;
		}
	}
}
