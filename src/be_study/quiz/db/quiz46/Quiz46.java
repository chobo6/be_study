package be_study.quiz.db.quiz46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quiz46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Professor> pList = findProfessorListByDeptno(301);
		
		if(pList == null) {
			System.out.println("데이터 없음");
		} else { //데이터 있음
			
			for(Professor p : pList) {
				System.out.println(p.toString());
			}
		}
		
	}

	public static List<Professor> findProfessorListByDeptno(int deptno) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null;  //db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<Professor> pList = null;
		
		//실행 쿼리 준비
		String sqlQuery = " select profno, name, id, position, pay, deptno from professor where deptno = ? ";
		
		//쿼리 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);	
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();
			
			//조회 결과가 1개 행만 나오는 상황
			while(rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다. 
				//데이터가 있다
				
				
				//dept 조회 한 행 데이터
				Professor p = new Professor();
				p.setProfno( rs.getInt("profno") );
				p.setName( rs.getString("name") );
				p.setId( rs.getString("id") );
				p.setPosition( rs.getString("position") );
				p.setPay( rs.getInt("pay") );
				p.setDeptno( rs.getInt("deptno") );
				
				if(pList == null) {
					pList = new ArrayList<Professor>();
				}
				pList.add(p); //최종 return 할 dept목록 list에 추가
			}
			//if 가 거짓이면 데이터가 없다...
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();  //Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pList;
	}
}