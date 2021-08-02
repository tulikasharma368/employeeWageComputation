package wageComputation;

public class wageDiffCompanies {
	public static final int is_full_time=1;
	public static final int is_part_time=2;
	
	public static int computeWage(String company, int wage_per_hour,int days_worked,int hours_worked) {
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
		System.out.println("Wage of the employee for"+company+" is "+wage);
		return wage;
	}
	public static void main(String[] args) {
		computeWage("JPMC",20,20,100);
		computeWage("IBM",25,30,150);
	}
}
