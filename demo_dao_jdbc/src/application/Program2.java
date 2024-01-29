package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao  DepartmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n\t=== TEST 1: department findById =====");
		Department department = DepartmentDao.findById(1);
		System.out.println(department);
		
		
		sc.close();

	}

}
