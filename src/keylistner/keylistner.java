package keylistner;


import java.awt.*; 
import java.awt.event.*; 


public class keylistner  extends Frame implements KeyListener  {

	  private TextField textField; 
	    private Label displayLabel; 
	    
	    
	    public keylistner() { 
	        // Set frame properties 
	        setTitle("Typed Text Display"); 
	        setSize(400, 500); 
	        setLayout(new FlowLayout()); 
	  
	        // Create and add a TextField for text input 
	        textField = new TextField(20); 
	        textField.addKeyListener(this); 
	        add(textField); 
	  
	        // Create and add a Label to display typed text 
	        displayLabel = new Label("Typed Text: "); 
	        add(displayLabel); 
	  
	        // Ensure the frame can receive key events 
	        setFocusable(false); 
	        setFocusTraversalKeysEnabled(false); 
	          
	        // Make the frame visible 
	        setVisible(true); 
	    } 
	  

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 char keyChar = e.getKeyChar(); 
	        displayLabel.setText("Typed Text: " + textField.getText() + keyChar); 
		
	}
	
	
public static void main(String[] args) {
		
new keylistner();
	}
}
