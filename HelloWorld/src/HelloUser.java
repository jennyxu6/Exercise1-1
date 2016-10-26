
public class HelloUser {
	String userName;
	
	HelloUser(String userName){
		this.userName = userName;
	}
	
	public void greetUser(){
		System.out.println("Hello " + userName + "!");
	}
}
