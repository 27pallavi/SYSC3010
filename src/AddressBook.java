import java.util.ArrayList;
public class AddressBook {
	 ArrayList<BuddyInfo> info=new ArrayList<BuddyInfo>();
	 
	public void main(String[] args) 
	{
		AddressBook book=new AddressBook();
		BuddyInfo b=new BuddyInfo();
		b.setName("homer");
		BuddyInfo b1=new BuddyInfo();
		b1.setName("ted");
		book.addBuddy(b);
		book.addBuddy(b1);
		book.removeBuddy(b1);
		System.out.println("Address Book");
	}
		
	private void addBuddy(BuddyInfo B)
	{
		info.add(B);
	}
	
	private void removeBuddy(BuddyInfo B)
	{
		info.remove(B);
	}

}
