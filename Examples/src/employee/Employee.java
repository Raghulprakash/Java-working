package employee;

public class Employee extends Employeedetails {

	public static void main(String[] args) {
		Employee emp = new Employee();  
        emp.setid(01);  
        emp.setName("Arun");  
        emp.setDepartment("IT");  
        emp.setSalary(25000);  
        emp.setAddress("Chennai");  
        emp.setEmail("Arun123@gmail.com");
        System.out.println(emp); 
        emp.setid(02);  
        emp.setName("Balu");  
        emp.setDepartment("NON-IT");  
        emp.setSalary(35000);  
        emp.setAddress("Mumbai");  
        emp.setEmail("Balu123@gmail.com");
        System.out.println(emp); 
        emp.setid(03);  
        emp.setName("Chandru");  
        emp.setDepartment("Tech Support");  
        emp.setSalary(45000);  
        emp.setAddress("Delhi");  
        emp.setEmail("Chandru123@gmail.com");
        System.out.println(emp); 
       
	}

}
