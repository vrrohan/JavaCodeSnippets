package my;
import java.util.Date;

class PlayerBean implements Player {

	//Bean Property
	Date regis;
	
	public PlayerBean() {
		System.out.println("PlayerBean constructor...");
		System.out.println(this.hashCode());
	}

	public void setRegis(Date regis) {
		System.out.println("PlayerBean setter injection");
		this.regis=regis;
		System.out.println(this.hashCode());
	}

	public String getRegisDay(String name) {
		return "welcome " + name + "\nDate of Registration is : " + regis;
	}

}