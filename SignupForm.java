import javax.swing.*;
import java.awt.*;

public class SignupForm {

	public static void main(String[] args) {
		
		JFrame MainFrame=new JFrame();
		MainFrame.setSize(300,300);
		
		MainFrame.setTitle("Signup Form");
		
		JPanel mainPanel=new JPanel();
		mainPanel.setLayout(new GridLayout(6,2,10,10));
		
		JLabel nameLabel=new JLabel("Name");
		JTextField nameField= new JTextField();
		
		JLabel gmailLabel =new JLabel("Email");
		JTextField gmailField=new JTextField();
		
		JLabel genderLabel=new JLabel();
		JRadioButton male= new JRadioButton("male");
		JRadioButton female= new JRadioButton("female");
		ButtonGroup genderButtonGroup=new ButtonGroup();
		genderButtonGroup.add(male);
		genderButtonGroup.add(female);
		JPanel genderPanel=new JPanel();
		genderPanel.setLayout(new FlowLayout());
		genderPanel.add(male);
		genderPanel.add(female);
		
		JLabel countryLabel =new JLabel("country");
		String [] countries= {"India","USA","SaudiArabia","Dubai"};
		JComboBox<String> countryBox=new JComboBox<>(countries);
		
		
		JLabel AddressLabel= new JLabel("Address");
		JTextArea addressArea =new JTextArea (3,4);
		
		JButton SubmitBtn =new JButton("Submit");
		
		mainPanel.add(nameLabel);
		mainPanel.add(nameField);
		mainPanel.add(gmailLabel);
		mainPanel.add(gmailField);
		 mainPanel.add(genderLabel);
	    mainPanel.add(genderPanel);
		mainPanel.add(countryLabel);
		mainPanel.add(countryBox);
		mainPanel.add(AddressLabel);
		mainPanel.add(addressArea);
		mainPanel.add(new JLabel(""));
		mainPanel.add(SubmitBtn);
		
		MainFrame.add(mainPanel);
		MainFrame.setLocationRelativeTo(null);
	    MainFrame.setVisible(true);
	        
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
