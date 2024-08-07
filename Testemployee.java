
public class Testemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		
		e1.insert(22, "Indramal", 80000);
		e2.insert(23, "Bijendra", 75000);
		e3.insert(24, "anosh", 60000);
		e4.insert(25, "Apa", 95000);
		
		e1.dis();

		e2.dis();

		e3.dis();

		e4.dis();

	}

}
