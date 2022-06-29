package modelClass;

public class member {
	private int memberid;
	private String mem_icnum;
	private String mem_name;
	private int mem_age;
	private String mem_gender;
	private String mem_address;
	private String mem_email;
	private String mem_phonenum;
	private String representative_name;
	private String representative_icnum;
	
	public member() {
		memberid = 0;
		mem_icnum = null;
		mem_name = null;
		mem_age = 0;
		mem_gender = null;
		mem_address = null;
		mem_email = null;
		mem_phonenum = null;
		representative_name = null;
		representative_icnum = null;
	}
	
	
	
	public member(String mem_icnum, String mem_name, int mem_age, String mem_gender, String mem_address,
			String mem_email, String mem_phonenum, String representative_name, String representative_icnum) {
		
		this.mem_icnum = mem_icnum;
		this.mem_name = mem_name;
		this.mem_age = mem_age;
		this.mem_gender = mem_gender;
		this.mem_address = mem_address;
		this.mem_email = mem_email;
		this.mem_phonenum = mem_phonenum;
		this.representative_name = representative_name;
		this.representative_icnum = representative_icnum;
	}



	public int getMemberid() {return memberid;}
	public void setMemberid(int memberid) {this.memberid = memberid;}
	public String getMem_icnum() {return mem_icnum;}
	public void setMem_icnum(String mem_icnum) {this.mem_icnum = mem_icnum;}
	public String getMem_name() {return mem_name;}
	public void setMem_name(String mem_name) {this.mem_name = mem_name;}
	public int getMem_age() {return mem_age;}
	public void setMem_age(int mem_age) {this.mem_age = mem_age;}
	public String getMem_gender() {return mem_gender;}
	public void setMem_gender(String mem_gender) {this.mem_gender = mem_gender;}
	public String getMem_address() {return mem_address;}
	public void setMem_address(String mem_address) {this.mem_address = mem_address;}
	public String getMem_email() {return mem_email;}
	public void setMem_email(String mem_email) {this.mem_email = mem_email;}
	public String getMem_phonenum() {return mem_phonenum;}
	public void setMem_phonenum(String mem_phonenum) {this.mem_phonenum = mem_phonenum;}
	public String getRepresentative_name() {return representative_name;}
	public void setRepresentative_name(String representative_name) {this.representative_name = representative_name;}
	public String getRepresentative_icnum() {return representative_icnum;}
	public void setRepresentative_icnum(String representative_icnum) {this.representative_icnum = representative_icnum;}
}
