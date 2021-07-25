package wageComputation;

public class partTimeWage{
	public static void main(String[] args) {
		int is_full_time=1;
		int is_part_time=2;
		int attendance,work_hours=0, wage_per_hour=20, wage_total;
		attendance=((int)(Math.floor(Math.random()*10)))%3;
		if(attendance==is_full_time)
			work_hours=8;
		else if(attendance==is_part_time)
			work_hours=4;
		else
			work_hours=0;
		wage_total=work_hours*wage_per_hour;
		System.out.println("Wage of the employee: "+wage_total);
		
		
		
	}
	
}
