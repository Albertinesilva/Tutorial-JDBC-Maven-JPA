package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n\t=== TEST 1: department findById =====");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n\t=== TEST 2: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n\t=== TEST 3: department insert =====");
		Department newDepartment = new Department(null, "Pedagogia");
		departmentDao.insert(newDepartment);
		System.out.println("\n\tInserted! New id: " + newDepartment.getId());
		
		System.out.println("\n\t=== TEST 4: department update =====");
		newDepartment = departmentDao.findById(6);
		newDepartment.setName("Estoque");
		departmentDao.update(newDepartment);
		System.out.println("\n\tUpdate completed");
		
		System.out.println("\n\t=== TEST 5: department delete =====");
		System.out.print("\n\tEnter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleltById(id);
		System.out.println("\n\tDelete completed!");

		sc.close();

	}

}
