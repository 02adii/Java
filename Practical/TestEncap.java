package CoreJava;

public class TestEncap {

	public static void main(String[] args) {
		EncapsulationDemo e = new EncapsulationDemo();
		e.setSsn(1);
		e.setEmpAge(30);
		e.setEmployee("adii");
	    System.out.println(e.getSsn());
	    System.out.println(e.getEmployee());
	    System.out.println(e.getEmpAge());
		

	}

}
