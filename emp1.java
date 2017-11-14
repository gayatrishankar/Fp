package org.dummy.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {

	public Employee( String name, String emailId, long phone) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
	}

	@Id
	@GeneratedValue
	@Column(name = "Emp_Id")
	private int id;
	@Column(name = "Emp_Name", length = 150, nullable = false)
	private String name;
	@Column(name = "Email_Id", length = 150, nullable = false, unique = true)
	private String emailId;
	@Column(name = "Emp_Phoneno", length = 10, nullable = false, unique = true)
	private long phone;
	@Column(name = "Basic_Salary")
	private double basicSalary;
	@Column(name = "HRA")
	private float houseRentAllovance;
	@Column(name = "TA")
	private float travelAllovance;
	@Column(name = "DA")
	private float dearnessAllovance;
	@Column(name = "PF")
	private float providentFund;
	@Transient
	private double netsalary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getHouseRentAllovance() {
		return houseRentAllovance;
	}

	public void setHouseRentAllovance(float houseRentAllovance) {
		this.houseRentAllovance = houseRentAllovance;
	}

	public float getTravelAllovance() {
		return travelAllovance;
	}

	public void setTravelAllovance(float travelAllovance) {
		this.travelAllovance = travelAllovance;
	}

	public float getDearnessAllovance() {
		return dearnessAllovance;
	}

	public void setDearnessAllovance(float dearnessAllovance) {
		this.dearnessAllovance = dearnessAllovance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public double getNetsalary() {
		return netsalary;
	}

	/*
	 * public boolean isGender() { return gender; } public void
	 * setGender(boolean gender) { this.gender = gender; public void
	 * setNetsalary(double netsalary) { this.netsalary = netsalary;} }
	 */

}
