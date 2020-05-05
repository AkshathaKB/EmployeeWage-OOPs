public class EmpWageBuilderUCSwitch {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int  EMP_RATE_PER_HRS = 20;
	public static void main(String[] args) {
		int empwage = 0;
		int empHrs = 0;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		switch (empCheck) {
			case FULL_TIME:
			empHrs = 8;
		else  if(empCheck == PART_TIME)
			empHrs = 4;
		empwage = empHrs * EMP_RATE_PER_HRS;

		System.out.println("empwage is" + empwage);
	}
}
