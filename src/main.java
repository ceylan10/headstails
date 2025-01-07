import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog("Heads or Tails");
        value = value.toLowerCase();


        boolean spin = Math.random() < 0.5;


        String result = spin ? "heads" : "tails";


        if (value.equals(result)) {
            JOptionPane.showMessageDialog(null, "Result: " + result + "\nYou guessed it right!");
        } else {
            JOptionPane.showMessageDialog(null, "Result: " + result + "\nBetter luck next time!");
        }
    }
}
