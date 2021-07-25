package wageComputation;

public class attendance {
	public static void main(String[] args) {
		int attendance=0;
		attendance=((int)(Math.random()*10))%2;
		System.out.println("Welcome to wage computation program");
		if(attendance==0)
			System.out.println("Employee is absent");
		else
			System.out.println("Employee is present");
	}

}
