
public class MemberDTO {

	public String name;
	public String phone;
	public String email;

	public MemberDTO() {
		// 아무정보도 모를때
	}

	public MemberDTO(String name) {
		// 이름만 알때
		this.name = name;
	}

	public MemberDTO(String name, String phone) {
		// 이름과 전화번호만 알때
		this.name = name;
		this.phone = phone;
	}

	public MemberDTO(String name, String phone, String email) {
		// 모든정보를 알고있을 떄
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String toString(){
		return "Name= " + name +" Phone="+ phone +" eMail="+email;
	}
}