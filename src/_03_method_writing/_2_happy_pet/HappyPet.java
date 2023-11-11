package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinesslevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String breed = JOptionPane.showInputDialog("what king of pet would you like? (cat or dog)");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			while(true){// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what would you like to do?", "option", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "pet", "clean", "walk" }, null);
			if (task == 0) {
				pet(breed);
			}
			if (task == 1) {
				clean(breed);
			}
			if (task == 2) {
				walk(breed);
			}
			}
			// 6. Use user input to call the appropriate method created in step 5 below.
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	static void pet(String breed) {
		happinesslevel ++;
		if (breed.equals("cat")) {
			JOptionPane.showMessageDialog(null, "your cat purrs as you pet it");
		}
		else {
			JOptionPane.showMessageDialog(null, "yor dog wags it's tail as you pet it");
		}
	}
	static void clean(String breed ) {
		if (breed.equals ("cat")) {
			happinesslevel += 3;
			JOptionPane.showMessageDialog(null, "your cat seems pleased with you");
		}
		else {
			happinesslevel ++;
		}
	}
	static void walk(String breed) {
		if (breed.equals("cat")) {
			happinesslevel --;
			JOptionPane.showMessageDialog(null, "the cat goes limp and hisses at you as you drag it along the floor.");
		}
		else {
			happinesslevel +=3;
			JOptionPane.showMessageDialog(null, "you enjoy a nice and peaceful walk with your dog");
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}	