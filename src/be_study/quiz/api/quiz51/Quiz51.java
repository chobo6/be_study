package be_study.quiz.api.quiz51;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Quiz51 {
    public static void main(String[] args) throws IOException {
    	MinuDustFrcstDspth mdfd = new MinuDustFrcstDspth();
    	MinuDustWeekFrcstDspth mdwfd = new MinuDustWeekFrcstDspth();
    	
    	List<DustFDDTO> dustFDList = new ArrayList<DustFDDTO>();
    	dustFDList = mdfd.getDustItemsInfo("2026-01-16");
    	
    	List<DustWFDDTO> dustWFDList = new ArrayList<DustWFDDTO>();
    	dustWFDList = mdwfd.getDustWeekItemsInfo("2026-01-15");
    	
    	System.out.println(mdwfd.requestApi("2026-01-15"));
//    	for (int i = 0; i < dustFDList.size(); i++) {
//    	    DustFDDTO dto = dustFDList.get(i);
//    	    System.out.println(dto.toString());
//    	}
    	
//		DustFDDAO dao = new DustFDDAO();
//		int insertCount = dao.saveDustFDList(dustFDList);
//		
//		System.out.println(insertCount + "건 저장 완료");
    	
		DustWFDDAO dao = new DustWFDDAO();
		int insertCount = dao.saveDustWeekFDList(dustWFDList);
		
		System.out.println(insertCount + "건 저장 완료");
    	
    }
}
