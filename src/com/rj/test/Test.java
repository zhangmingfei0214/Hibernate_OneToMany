package com.rj.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rj.entity.Department;
import com.rj.entity.Employee;
import com.rj.util.HibernateUtil;

/**
 *测试类
 */
public class Test {
	public static void main(String[] args) {
		//add();
		findEmployeeByDepartment();
}
	/**
	 * 添加员工的方法
	 */
	public static void add() {
		Department d = new Department("工程规划院2","地质勘察、岩石采集、数据分析......");
		Employee e1 = new Employee("杨永龙","男",22);
		Employee e2 = new Employee("刘海红","女",25);
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(d);
		session.save(e1);
		session.save(e2);
		tx.commit();
		HibernateUtil.closeSession(session);
	}
	
	/**
	 * ge
	 */
	public static void findEmployeeByDepartment() {
		Session session = HibernateUtil.getSession();
		Department department = (Department) session.get(Department.class, 3);
		System.out.println(department.getDname()+","+department.getDdesc());
		
		/*Set<Employee> employees = department.getEmployees();
		for(Employee employee:employees) {
			System.out.println(employee.getEname()+","+employee.getAge());
		}*/
	}
}

