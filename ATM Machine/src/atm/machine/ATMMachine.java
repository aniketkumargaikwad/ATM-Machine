
package atm.machine;

import java.io.IOException;

public class ATMMachine {

    
    public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("Welcome to the ATM Project!");
	}
    
}
