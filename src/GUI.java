import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener {

	JFrame frame;
	JMenuBar menu;
	JMenu addBook;
	JMenu budInfo;
	AddressBook addressBook;
	BuddyInfo bInfo;
	public GUI(){
		frame= new JFrame("Address Book");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400, 300);;
		//create menu bar
		menu=new JMenuBar();
		frame.setJMenuBar(menu);
		// item on menu bar
		addBook=new JMenu("Address Book");
		menu.add(addBook);
		// items in address book menu
		JMenuItem create=new JMenuItem("Create");			//create
		create.addActionListener(this);
		addBook.add(create);
		
		JMenuItem save=new JMenuItem("Save");				//save
		save.addActionListener(this);
		addBook.add(save);
		
		JMenuItem display=new JMenuItem("Display");		//display
		display.addActionListener(this);
		addBook.add(display);
		
		budInfo=new JMenu("Buddy Info");
		menu.add(budInfo);
		frame.setVisible(true);
		
		JMenuItem remove=new JMenuItem("Remove");			//remove
		remove.addActionListener(this);
		budInfo.add(remove);
		
		JMenuItem edit=new JMenuItem("Edit");				//edit
		edit.addActionListener(this);
		budInfo.add(edit);
	}
	
	public static void main(String args[])throws IOException{
		
		GUI gui=new GUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Create")){
			addressBook=new AddressBook();
		}
		else if(e.getActionCommand().equals("Save")){
			
			for(BuddyInfo b: addressBook.buddyInfo)
			{
				BufferedWriter out;
				try {
					out = new BufferedWriter(new FileWriter("myFile.txt"));
					out.write(b.toString());
					out.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		else if(e.getActionCommand().equals("Display")){
			
		}
			
	}
	
	
}
