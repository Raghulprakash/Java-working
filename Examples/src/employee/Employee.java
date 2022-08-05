package employee;

public class Employee extends Employeedetails {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp.setid(01);
		emp.setName("Arun");
		emp.setDepartment("IT");
		emp.setSalary(25000);
		emp.setAddress("Chennai");
		emp.setEmail("Arun123@gmail.com");

		emp1.setid(02);
		emp1.setName("Balu");
		emp1.setDepartment("NON-IT");
		emp1.setSalary(35000);
		emp1.setAddress("Mumbai");
		emp1.setEmail("Balu123@gmail.com");

		emp2.setid(03);
		emp2.setName("Chandru");
		emp2.setDepartment("Tech Support");
		emp2.setSalary(45000);
		emp2.setAddress("Delhi");
		emp2.setEmail("Chandru123@gmail.com");
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);

	}

}
