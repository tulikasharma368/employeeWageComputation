package wageComputation;

public class employeeWageSwitchCase {
	public static final int is_full_time=1;
	public static final int is_part_time=2;
	public static final int wage_per_hour=20;
	public static void main(String[] args) {
		int attendance,work_hours=0,wage_total;
		attendance=((int)(Math.floor(Math.random()*10)))%3;
		switch (attendance) {
		case is_full_time: 
			work_hours=8;
			break;
		case is_part_time:
			work_hours=4;
			break;
		default:
			work_hours=0;
			break;
		}
		wage_total=work_hours*wage_per_hour;
		System.out.println("Wage of the employee: "+wage_total);
	}

}
