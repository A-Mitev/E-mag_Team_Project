package oop;

public abstract class User {
	
	protected WareHouse warehouse;
	private static final int GSM_NUMBER_LENGTH = 10;
	private boolean adminRights;
	private String name;
	private String email;
	private String gsm;
	private String password;//passworda ne sum siguren dali trqbva da e taka ako nqkoi znae drug nachin e hubavo da go napishe
	
	public User(String name, String email, String gsm, WareHouse warehouse){
		this.setEmail(email);
		this.setGsm(gsm);
		if(!warehouse.equals(null)){
			this.warehouse = warehouse;
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!name.equals(null) && !name.equals("")){
			this.name = name;
		}
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(!email.equals(null) && !email.equals("")){
			this.email = email;
		}
	}

	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		if(gsm.startsWith("08") && gsm.length() == GSM_NUMBER_LENGTH && !gsm.equals(null) && !gsm.equals("")){
			this.gsm = gsm;
		}
	}
	
	//chudq se vse oshte kude da izpolzvam adminskite prava, no imam edna ideq i moga da q spodelq kato se vidim ili chuem
	public boolean isAdming(){
		return adminRights;
	}
	public void setAdminRights(boolean adminRights){
		this.adminRights = adminRights;
	}
	
}
