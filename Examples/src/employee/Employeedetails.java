package employee;

public class Employeedetails {

	int id, salary;
	String name, address, department, email;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + ", salary = " + salary + ", name = " + name + ", address = " + address
				+ ", department = " + department + ", email = " + email + "]";
	}

}
