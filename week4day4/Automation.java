package week4day4;

public class Automation extends MultipleLanguage{

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		Automation tools = new Automation();
		tools.selenium();
		tools.java();
		tools.ruby();
	}

}
