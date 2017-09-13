
public class ReferenceStaticVariable {
	 String name;

	public ReferenceStaticVariable() {
	}

	public ReferenceStaticVariable(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReferenceStaticVariable reference = new ReferenceStaticVariable();
		reference.checkName();
	}
	
	public void checkName(){
		ReferenceStaticVariable reference1 = new ReferenceStaticVariable("sangmin");
		System.out.println(reference1.name);
		ReferenceStaticVariable reference2 = new ReferenceStaticVariable("sungchoon");
		System.out.println(reference1.name);
	}

}
