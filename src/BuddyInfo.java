
public class BuddyInfo {

	String name;
	String address;
	int number;
	
	public BuddyInfo(String name, String address, int number){
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public BuddyInfo(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuddyInfo b=new BuddyInfo("homer","carleton", 12);
		System.out.println("Hello "+b.getName());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
