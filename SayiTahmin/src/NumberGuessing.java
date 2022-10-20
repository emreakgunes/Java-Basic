import javax.swing.JOptionPane;

public class NumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true) {
			int n = (int) (Math.random() * 10 );
			
			JOptionPane.showMessageDialog(null, "Number Guessing game is starting... ","Number Guessing Game", JOptionPane.WARNING_MESSAGE);
			//JOptionPane.showMessageDialog(null, n);
			
			int tahmin = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your guess", "Guessing", JOptionPane.WARNING_MESSAGE));
			
			
			if(tahmin == n) {
				JOptionPane.showMessageDialog(null, "You won.!");
				break;
			}
			else if(tahmin > 10){
				JOptionPane.showMessageDialog(null, "Please enter your guess between 1 and 10 ");
				
				
			}
			else {
				JOptionPane.showMessageDialog(null, "You lose . The correct answer is : " + n);
			}
			
			
			
			
			}
		
	}

}
