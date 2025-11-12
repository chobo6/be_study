package be_study.quiz;

public class Quiz22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		int max = 0, min = 100, sum = 0, count = 0;
		double aver;
		for(int i=0; i<scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
			if(scores[i]>=80) {
				count++;
			}
			sum += scores[i];
		}
		aver = (double)sum/scores.length;
		System.out.println("최고 점수: "+max);
		System.out.println("최저 점수: "+min);
		System.out.println("평균 점수: "+aver);
		System.out.println("80점 이상 학생 수: "+count+"명");
		
	}
}
