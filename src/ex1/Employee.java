package ex1;

public class Employee {
	
private int id;
private String firstName;
private String lastName;
private int salary;

public Employee(int id, String firstName, String lastName, int salary) {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}
public int getId() {
	return this.id;
}
public String getFirstName() {
	return this.firstName;
}
public String getLastName() {
	return this.lastName;
}
public String getName() {
	return this.firstName + this.lastName;
}
public int getSalary() {
	return this.salary;
}
void setSalary(int salary) {
	this.salary = salary;
}
public int getAnnualSalary() {
	return this.salary * 12;
}
//raise Salary 
public int raiseSalary(int num) {
	this.salary = this.salary + this.salary / 100;
	return this.salary;
}
@Override
public String toString() {
	return "Employee[id = " + getId() + ", name = " + getName() +", salary = " + getSalary();
}
}
