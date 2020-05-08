
public class EmpWageBuilderUCwhile {
        public static final int PART_TIME = 1;
        public static final int FULL_TIME = 2;
        public static final int  EMP_RATE_PER_HRS = 20;
         public static final int  NUM_OF_WORKING_DAYS = 2;
	public static final int  MAX_HRS_IN_MONTH = 10;
        public static void main(String[] args) {
                int empwage = 0;
		int totalEmpHrs = 0;
                int totalEmpWage =0;
		int totalWorkingDays = 0;
		while(totalEmpHrs <= MAX_HRS_IN_MONTH && 
			totalWorkingDays < NUM_OF_WORKING_DAYS) {
		int empHrs = 0;
		totalWorkingDays++;
                int empCheck =(int) Math.floor(Math.random() * 10 ) % 3;
                switch (empCheck) {
                        case FULL_TIME:
                        empHrs = 8;
                        break;
                        case  PART_TIME:
                        empHrs = 4;
                        break;
                        default:
                        empHrs = 0;
        }
		totalEmpHrs += empHrs;
                empwage = empHrs * EMP_RATE_PER_HRS;
                totalEmpWage += empwage;
                System.out.println("Emp Wage: " + empwage);
        }

                System.out.println("Total Emp Wage is: " + totalEmpWage);
        }
}
	
