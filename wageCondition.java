package wageComputation;

public class wageCondition {
	public static final int is_full_time=1;
	public static final int is_part_time=2;
	public static final int wage_per_hour=20;
	public static final int days_worked=20;
	public static final int hours_worked=100;
	
	public static void main(String[] args) {
		System.out.println("Daily wage and total wage : ");
		int attendance,work_hours=0,wage=0,workingdays=0,workinghours=0;
		while(workinghours<hours_worked && workingdays<days_worked)
		{
			workingdays++;
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
			workinghours+=work_hours;
			System.out.println("Day: "+ workingdays + " Hours: " + workinghours);
		}
		wage=workinghours*wage_per_hour;
		System.out.println("Wage of the employee: "+wage);
	}

}
