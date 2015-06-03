package com.ejemplo.dao;

public class EmpleadoDTO {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	private String hire_date;
	private String job_id;
	private int salary;
	private int commision;
	private int manager_id;
	private int department_id;
	public EmpleadoDTO(int id, String firstname, String lastname, String email,
			String phonenumber, String hire_date, String job_id, int salary,
			int commision, int manager_id, int department_id) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.salary = salary;
		this.commision = commision;
		this.manager_id = manager_id;
		this.department_id = department_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommision() {
		return commision;
	}
	public void setCommision(int commision) {
		this.commision = commision;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	
	@Override
	public String toString() {
		String cadena_que_representa_a_un_empleado = new String("");

		cadena_que_representa_a_un_empleado = "Nombre = " + this.firstname + " salario = " + this.salary;
		
		return cadena_que_representa_a_un_empleado;
	}
}
