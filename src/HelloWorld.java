import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "Memes";
		JOptionPane.showMessageDialog(null, "Hey " + name);
		String Ans = JOptionPane.showInputDialog("Enter your fav color");
		JOptionPane.showMessageDialog(null, Ans);
		if (Ans.equals("green")) {
			JOptionPane.showMessageDialog(null, "You have no firends");
		} else {
			JOptionPane.showMessageDialog(null, "Your normal!");
		}

	}
}
