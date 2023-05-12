package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample2 extends Thread {

	@Override
	public void run() {
		// 실행시킬 코드
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}

	public static void main(String[] args) {

		Thread thread = new BeepPrintExample2();

		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}

}
