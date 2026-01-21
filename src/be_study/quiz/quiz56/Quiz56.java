package be_study.quiz.quiz56;

public class Quiz56 {

	public static void main(String[] args) {
		
		//짝수 출력	Even
		//홀수 출력	Odd
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		
		//et.run(); //단순 메소드 호출 (쓰레드로 실행되지 않음)
		et.start();
		ot.start();
		
		EvenRunnable er = new EvenRunnable();
		Thread t1 = new Thread(er);
		Thread t2 = new Thread(new OddRunnable());
		
		t1.start();
		t2.start();
		
		NumberThread nt1 = new NumberThread(true);
		NumberThread nt2 = new NumberThread(false);
		nt1.start();
		nt2.start();
		
	}
}

class EvenThread extends Thread {
	public void run() { 	//쓰레드 실행시 처리할 코드
		
//		for(int i=1; i<=100; i++) {
//			if(i%2 == 0) {
//				
//			}
//		}
		
		for(int i=2; i<=100; i+=2) {
			System.out.println(i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OddThread extends Thread {
	public void run() {		//쓰레드 실행시 처리할 코드
		for(int i=1; i<=100; i+=2) {
			System.out.println(i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class EvenRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=2; i<=100; i+=2) {
			System.out.println(i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OddRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=100; i+=2) {
			System.out.println(i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class NumberThread extends Thread {
	boolean isOdd;
	
	public NumberThread(boolean isOdd) {
		this.isOdd = isOdd;
	}
	
	public void run() {
		
		if(isOdd) {
			for(int i=1; i<=100; i+=2) {
				System.out.println(i);
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			for(int i=2; i<=100; i+=2) {
				System.out.println(i);
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}









