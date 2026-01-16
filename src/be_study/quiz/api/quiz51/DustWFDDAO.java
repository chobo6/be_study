package be_study.quiz.api.quiz51;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import be_study.db.v2.DBConnectionManager;

//Data Access Object
//DB 에 접근 데이터 처리 담당
public class DustWFDDAO {

	//Insert 
	public int saveDustWeekFDList(List<DustWFDDTO> list) {

		//DB에 저장..
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = " INSERT INTO DUST_WFD VALUES( ?, ?, ?, ?, ? ) ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅
			for (DustWFDDTO dto : list) {

	            psmt.setString(1, dto.getFrcstOneCn());
	            psmt.setString(2, dto.getFrcstTwoCn());
	            psmt.setString(3, dto.getPresnatnDt());
	            psmt.setString(4, dto.getFrcstOneDt());
	            psmt.setString(5, dto.getFrcstTwoDt());

	            result += psmt.executeUpdate(); // 누적
	        } //INSERT 

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}
