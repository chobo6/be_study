package be_study.quiz.api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Quiz48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jsonString = ""
				+ "{"
				+ "\"도서관\": {"
				+ "\"위치\": \"서울특별시 강남구\","
				+ "\"운영시간\": {"
				+ "\"평일\": [\"09:00\", \"21:00\"],"
				+ "\"주말\": [\"10:00\", \"18:00\"]"
				+ "},"
				+ "\"책목록\": ["
				+ "{"
				+ "\"제목\": \"자바 프로그래밍\","
				+ "\"저자\": \"홍길동\","
				+ "\"출판연도\": 2023,"
				+ "\"가격\": 25000,"
				+ "\"대출가능\": true,"
				+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]"
				+ "},"
				+ "{"
				+ "\"제목\": \"데이터 분석 입문\","
				+ "\"저자\": \"김철수\","
				+ "\"출판연도\": 2022,"
				+ "\"가격\": 28000,"
				+ "\"대출가능\": false,"
				+ "\"카테고리\": [\"데이터\", \"분석\"]"
				+ "}"
				+ "],"
				+ "\"특별서비스\": {"
				+ "\"키오스크\": true,"
				+ "\"스터디룸\": {"
				+ "\"개수\": 5,"
				+ "\"예약 가능\": true,"
				+ "\"비용\": {"
				+ "\"1시간당\": 5000,"
				+ "\"하루\": 30000"
				+ "}"
				+ "}"
				+ "}"
				+ "}"
				+ "}";
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonString);
			JSONObject library = (JSONObject)jsonObject.get("도서관");
			JSONObject hours = (JSONObject)library.get("운영시간");
			JSONArray weekday = (JSONArray)hours.get("평일");
			JSONArray weekend = (JSONArray)hours.get("주말");
			JSONArray bookList = (JSONArray)library.get("책목록");
			JSONObject book1 = (JSONObject)bookList.get(0);
			JSONObject book2 = (JSONObject)bookList.get(1);
			JSONArray cat1 = (JSONArray)book1.get("카테고리");
			JSONArray cat2 = (JSONArray)book2.get("카테고리");
			JSONObject service = (JSONObject)library.get("특별서비스");
			JSONObject studyRoom = (JSONObject)service.get("스터디룸");
			JSONObject cost = (JSONObject)studyRoom.get("비용");
			
			
			
			System.out.println("도서관 위치 : " + library.get("위치"));
			System.out.println("평일 운영시간 : " + weekday.get(0) + " ~ " + weekday.get(1));
			System.out.println("주말 운영시간 : " + weekend.get(0) + " ~ " + weekend.get(1));
			System.out.println("책 목록 : " + book1.get("제목") + ", " + book2.get("제목"));
			System.out.println(book1.get("제목") + " 카테고리 : " + cat1.get(0) + ", "+ cat1.get(1));
			System.out.println(book2.get("제목") + " 카테고리 : " + cat2.get(0) + ", "+ cat2.get(1));
			System.out.println("스터디룸 개수 : " + studyRoom.get("개수") + ", " + "예약가능 여부 : " + studyRoom.get("예약 가능"));
			System.out.println("비용 : " + "1시간당 " + cost.get("1시간당") + "원 , " + "하루 " + cost.get("하루") + "원");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
