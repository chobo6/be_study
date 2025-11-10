package be_study.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numArray = new int[5][5];
		for(int i=0; i<numArray.length; i++) {
			for(int j=0; j<numArray[i].length; j++) {
				if(i==j) {
					numArray[i][j] = 1;
				} else if(i<j) {
					numArray[i][j] = 2;
				} else {
					numArray[i][j] = 3;
				}
			}
		}
		for(int i=0; i<numArray.length; i++) {
			for(int j=0; j<numArray[i].length; j++) {
				System.out.print(numArray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
