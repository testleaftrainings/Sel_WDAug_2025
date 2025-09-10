package week6.day3;

public class LearnEncapsulation {
	
	private int ssn;
	private String empName;
	private int empAge;
	
	public static void main(String[] args) {
		LearnEncapsulation le=new LearnEncapsulation();
		le.setSsn(123456);
		le.setEmpName("saran");
		le.setEmpAge(50);
		System.out.println(le.getSsn());
		System.out.println(le.getEmpName());
		System.out.println(le.getEmpAge());
		
		
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
