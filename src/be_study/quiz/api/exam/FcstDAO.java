package be_study.quiz.api.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import be_study.db.v2.DBConnectionManager;

public class FcstDAO {
	public int saveFcst(List<FcstDTO> fDTOList) {

		//DB에 저장..
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = " INSERT INTO V_FCST VALUES( v_fcst_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?) ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅
			for(FcstDTO fDTO : fDTOList) {
				psmt.setString(1, fDTO.getBaseDate());
				psmt.setString(2, fDTO.getBaseTime());
				psmt.setString(3, fDTO.getCategory());
				psmt.setString(4, fDTO.getFcstDate());
				psmt.setString(5, fDTO.getFcstTime());
				psmt.setString(6, fDTO.getFcstValue());
				psmt.setLong(7, fDTO.getNx());
				psmt.setLong(8, fDTO.getNy());
				result += psmt.executeUpdate(); //INSERT 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}
