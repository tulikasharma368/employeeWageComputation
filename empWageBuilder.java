package wageComputation;

public class empWageBuilder {
	public static final int is_full_time=1;
	public static final int is_part_time=2;
	
	    String company;
	    int wage_per_hour;
	    int days_worked;
	    int hours_worked;
	    
	   
	public empWageBuilder(String company, int wage_per_hour,int days_worked,int hours_worked){
		this.company=company;
		this.wage_per_hour=wage_per_hour;
		this.days_worked=days_worked;
		this.hours_worked=hours_worked;
	}
	public void computeWage() {
		System.out.println("Total wage by "+company);
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
		System.out.println("Wage of the employee for"+company+" is "+wage +"\n");
		
	}
public static void main(String[] args) {
 empWageBuilder ibm=new empWageBuilder("IBM", 30, 22, 120);
 ibm.computeWage();
 empWageBuilder ibm2=new empWageBuilder("IBM2", 40, 20, 120);
 ibm2.computeWage();
 empWageBuilder ibm3=new empWageBuilder("IBM3", 35, 25, 125);
 ibm3.computeWage();
}

}

