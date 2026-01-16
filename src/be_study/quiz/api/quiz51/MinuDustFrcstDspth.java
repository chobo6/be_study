package be_study.quiz.api.quiz51;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class MinuDustFrcstDspth {
    public String requestApi(String searchDate) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=ea88f8d26f4924f3e93ed307f7a7a855d9978abb7b6d2f6182d83b669c2000da"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수(조회 날짜로 검색 시 사용 안함)*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호(조회 날짜로 검색 시 사용 안함)*/
        urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode(searchDate, "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 한달동안 예보통보 발령 날짜의 리스트 정보를 확인)*/
        urlBuilder.append("&" + URLEncoder.encode("InformCode","UTF-8") + "=" + URLEncoder.encode("PM10", "UTF-8")); /*통보코드검색(PM10, PM25, O3)*/
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
    public List<DustFDDTO> getDustItemsInfo(String searchDate) {
    	List<DustFDDTO> dustFDList= new ArrayList<DustFDDTO>();
    	try {
    		String jsonString = requestApi(searchDate);
    		
        	JSONParser jsonP = new JSONParser();
        	JSONObject obj = (JSONObject)jsonP.parse(jsonString);
        	JSONObject response = (JSONObject)obj.get("response");
        	JSONObject body = (JSONObject)response.get("body");
        	JSONArray items = (JSONArray)body.get("items");
        	
    		
    		for(Object o : items) {
    			JSONObject item = (JSONObject) o;
    			DustFDDTO dfdDTO = new DustFDDTO();
	    		dfdDTO.setDataTime((String) item.get("dataTime"));
	    		dfdDTO.setInformCode((String) item.get("informCode"));
	    		dfdDTO.setInformOverall((String) item.get("informOverall"));
	    		dfdDTO.setInformCause((String) item.get("informCause"));
	    		dfdDTO.setInformGrade((String) item.get("informGrade"));
	    		dustFDList.add(dfdDTO);
    		}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return dustFDList;
    }
}

