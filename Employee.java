
public class Employee {
	int id;
	String name;
	float salary;
	
	void insert(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
		
	}
	void dis() {
		System.out.println("The id is "+id+" of "+name+" who has salary of "+salary+"per month");
		
	}

}
