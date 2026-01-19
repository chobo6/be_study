package be_study.quiz.api.exam;

public class FcstDTO {
	String baseDate;
	String baseTime;
	
	String category;
	String fcstDate;
	String fcstTime;
	String fcstValue;
	long nx;
	long ny;
	
	public String getBaseDate() {
		return baseDate;
	}
	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}
	public String getBaseTime() {
		return baseTime;
	}
	public void setBaseTime(String baseTime) {
		this.baseTime = baseTime;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFcstDate() {
		return fcstDate;
	}
	public void setFcstDate(String fcstDate) {
		this.fcstDate = fcstDate;
	}
	public String getFcstTime() {
		return fcstTime;
	}
	public void setFcstTime(String fcstTime) {
		this.fcstTime = fcstTime;
	}
	public String getFcstValue() {
		return fcstValue;
	}
	public void setFcstValue(String fcstValue) {
		this.fcstValue = fcstValue;
	}
	public long getNx() {
		return nx;
	}
	public void setNx(long nx) {
		this.nx = nx;
	}
	public long getNy() {
		return ny;
	}
	public void setNy(long ny) {
		this.ny = ny;
	}
	@Override
	public String toString() {
		return "FcstDTO [baseDate=" + baseDate + ", baseTime=" + baseTime + ", category=" + category + ", fcstDate="
				+ fcstDate + ", fcstTime=" + fcstTime + ", fcstValue=" + fcstValue + ", nx=" + nx + ", ny=" + ny + "]";
	}

	
	
	
}
