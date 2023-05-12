package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new Thread() {

			@Override
			public void run() {
				// 실행시킬 코드 런안에 쓰레드로 이용할 코드를 작성
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {

					}
				}

			}

		};

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
