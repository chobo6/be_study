package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
		
		DeptDAO deptDAO = new DeptDAO();
		
		Dept d1 = deptDAO.findDeptByDeptno(20);
		System.out.println(d1.getDeptno() + " " + d1.getDname() + " " + d1.getLoc());
		System.out.println(d1.toString());
		
		Dept d2 = deptDAO.findDeptByDeptno(70);
		if(d2 != null)
			System.out.println(d2.toString());
		
		Dept d3 = deptDAO.findDeptByDname("SALES");
		System.out.println(d3.toString());
		
		Dept d4 = deptDAO.findDeptByDname("DEEPSLEEP");
		if(d4 == null) {
			System.out.println("해당 부서명 데이터 없음");
		} else {
			System.out.println(d4.toString());
		}
		
		List<Dept> deptList = deptDAO.findDeptList();
		
		if(deptList == null) {
			System.out.println("데이터 없음");
		} else { //데이터 있음
			
			for(Dept d : deptList) {
				System.out.println(d.toString());
			}
		}
		
		ProductDAO productDAO = new ProductDAO();
		Product p = productDAO.findProductByPCode(103);
		System.out.println(p.toString());

		List<Product> pList = productDAO.findProductList();
		for(Product pd : pList) {
			System.out.println(pd.toString());
		}
		
	}	
	

}







