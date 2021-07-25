package wageComputation;

public class fullDayWage {
	public static void main(String[] args) {
		int attendance=0, wage_total=0;
		int wage_per_hour=20, empHour=0;
		attendance=((int)(Math.random()*10))%2;
		if(attendance==1)
			empHour=8;
		wage_total=empHour*wage_per_hour;
		System.out.println("Wage of the employee: "+wage_total);			
	}
}
