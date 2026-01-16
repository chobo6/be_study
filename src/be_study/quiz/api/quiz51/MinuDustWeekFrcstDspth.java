package be_study.quiz.api.quiz51;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MinuDustWeekFrcstDspth {
	public String requestApi(String searchDate) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=ea88f8d26f4924f3e93ed307f7a7a855d9978abb7b6d2f6182d83b669c2000da"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode(searchDate, "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 호출 당일 날짜를 기준으로 주간예보 리스트 확인)*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        
        return sb.toString();
    }
	
	public List<DustWFDDTO> getDustWeekItemsInfo(String searchDate) {
		List<DustWFDDTO> dustWFDList= new ArrayList<DustWFDDTO>();
    	try {
    		String jsonString = requestApi(searchDate);
    		
        	JSONParser jsonP = new JSONParser();
        	JSONObject obj = (JSONObject)jsonP.parse(jsonString);
        	JSONObject response = (JSONObject)obj.get("response");
        	JSONObject body = (JSONObject)response.get("body");
        	JSONArray items = (JSONArray)body.get("items");
        	
    		
    		for(Object o : items) {
    			JSONObject item = (JSONObject) o;
    			DustWFDDTO dfdWDTO = new DustWFDDTO();
	    		dfdWDTO.setFrcstOneCn((String) item.get("frcstOneCn"));
	    		dfdWDTO.setFrcstTwoCn((String) item.get("frcstTwoCn"));
	    		dfdWDTO.setPresnatnDt((String) item.get("presnatnDt"));
	    		dfdWDTO.setFrcstOneDt((String) item.get("frcstOneDt"));
	    		dfdWDTO.setFrcstTwoDt((String) item.get("frcstTwoDt"));
	    		dustWFDList.add(dfdWDTO);
    		}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return dustWFDList;
	}
}