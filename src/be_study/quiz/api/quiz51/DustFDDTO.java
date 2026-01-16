package be_study.quiz.api.quiz51;

public class DustFDDTO {
	String dataTime;
	String informCode;
	String informOverall;
	String informCause;
	String informGrade;

	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	public String getInformCode() {
		return informCode;
	}
	public void setInformCode(String informCode) {
		this.informCode = informCode;
	}
	public String getInformOverall() {
		return informOverall;
	}
	public void setInformOverall(String informOverall) {
		this.informOverall = informOverall;
	}
	public String getInformCause() {
		return informCause;
	}
	public void setInformCause(String informCause) {
		this.informCause = informCause;
	}
	public String getInformGrade() {
		return informGrade;
	}
	public void setInformGrade(String informGrade) {
		this.informGrade = informGrade;
	}
	@Override
	public String toString() {
		return "DustFDDTO [dataTime=" + dataTime + ", informCode=" + informCode + ", informOverall=" + informOverall
				+ ", informCause=" + informCause + ", informGrade=" + informGrade + "]";
	}
	
	
}

//class itemsDTO {
//	
//}
