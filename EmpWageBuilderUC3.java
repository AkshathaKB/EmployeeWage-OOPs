public class EmpWageBuilderUC3 {
        public static void main(String[] args){
        int IS_FULL_TIME = 2;
	int IS_PART_TIME = 1;
        int EMP_RATE_PER_HRS = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
                empHrs = 8;
        else if(empCheck == IS_PART_TIME)
                empHrs = 4;
        empWage = empHrs * EMP_RATE_PER_HRS;
        System.out.println("Emp Wage: " + empWage);
        }
}




