package org.dummy.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dummy.emp.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sample {

	public static void main(String[] args) throws IOException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		int id;
		String name;
		String emailId;
		long phone;
		// boolean gender;

		while (i < 3) {
			session.beginTransaction();
			System.out.print("Enter Name:");
			name = bf.readLine();
			System.out.print("Enter emailid:");
			emailId = bf.readLine();
			System.out.print("Enter phoneNumber:");
			phone = Long.valueOf((bf.readLine()));
			/*
			 * System.out.print("Enter gender:");
			 * gender=Boolean.valueOf(bf.readLine());
			 */

			Employee employee = new Employee(name, emailId, phone);
			//System.out.print("id:");
			//System.out.println(employee.getId());
			System.out.print("Name:");
			System.out.println(employee.getName());
			System.out.print("emailid:");
			System.out.println(employee.getEmailId());
			System.out.print("phoneNumber:");
			System.out.println(employee.getPhone());
			/*
			 * System.out.print("gender:");
			 * System.out.println(employee.isGender());
			 */

			session.save(employee);
			session.getTransaction().commit();
			i++;
		}

		session.close();

	}

}
