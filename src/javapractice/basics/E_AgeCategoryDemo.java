package javapractice.basics;

public class E_AgeCategoryDemo {//class name should be meaningful,camelcase convention
	
	// 0 - 12 KID  - age is grearthan ZERO lessthan EQUSL 12
	// 13 - 19 TEEN AGE
	// 20 - 40 YOUNG AGE
	//41 - 60 MIDDLE AGE
	// >60 OLD AGE 

	
	public static void main(String[] args) {
		
		int age =82;//variable decleration
		
		if(age>=0 && age<=12) 
		{
		
			System.out.println("You are KID");
		}else if(age>=13 && age<=19)
		{
			System.out.println("You are in TEEN age");
		}else if(age>=20 && age<=40)
		{
			System.out.println("You are in YOUNG age");	
		}else if(age>=41 && age<=60)
		{
			System.out.println("You are in MIDDLE age");		
		}else
		{
			System.out.println("You are in OLD age");	
		}
	}
}
