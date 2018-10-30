import com.opensymphony.xwork2.ActionSupport;

public class PersonRegistration extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		InsertPersonObject.savePerson(person);
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(person.getEmailId().length()==0) {
			addFieldError("person.emailId", "vaild email id required");
		}
		if(person.getEmailId().length()>0) {
			String[] domainsName = person.getEmailId().split("@");
			System.out.println(domainsName[1]);
			if(!domainsName[1].equalsIgnoreCase("gmail.com")) {
				if(!domainsName[1].equalsIgnoreCase("yahoo.com")) {
					addFieldError("person.emailId", "only gmail.com & yahoo.com allowed");					
				}
			}
		}//end of 2nd if statement

	}//end of validate()
	
	

}
