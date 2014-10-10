/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : User input
 * Lecture  : http://youtu.be/gGlaiOOzrRU
 * Tutorial : http://youtu.be/NOR-EDO3ul8
 * License  : None.  Do with it as you wish! :)
 */

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String userMessage = 
				JOptionPane.showInputDialog("input something");
		
		JOptionPane.showMessageDialog(null, userMessage);
		
		//JOptionPane.show //press ctrl + space
	
	}

}
