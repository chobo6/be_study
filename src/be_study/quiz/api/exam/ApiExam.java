package be_study.quiz.api.exam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApiExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		VilageFcstRepository v = new VilageFcstRepository();
		System.out.println(v.requestApi("20260115"));
		System.out.println(v.requestApi("20260116"));
		
		List<FcstDTO> fList = new ArrayList<FcstDTO>();
		fList = v.getFcst("20260116");
//		for (int i = 0; i < fList.size(); i++) {
//		    FcstDTO dto = fList.get(i);
//		    System.out.println(dto.toString());
//		}
		
//		System.out.println(fList.get(0).toString());
		
		FcstDAO fDAO = new FcstDAO();
		int insertCount = fDAO.saveFcst(fList);
		System.out.println(insertCount + "건 저장 완료");
		
	}

}
