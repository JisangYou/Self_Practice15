
public class ReferenceConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceConstructor reference = new ReferenceConstructor();
		reference.makeMemeberObject();
	}

	public void makeMemeberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("Sangmin");
		MemberDTO dto3 = new MemberDTO("Sangmin", "01053193270");
		MemberDTO dto4 = new MemberDTO("Sangmin", "01053193270", "god@godofjava.com");
	}

}
