package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) {
		Reader reader = null;

		try {

			// 1문자로 읽기
			reader = new FileReader("C:/Temp/test.txt");
			while (true) {
				int data = reader.read(); // .read = 1문자씩 읽는다
				if (data == -1)
					break;
				System.out.println((char) data);
			}

			reader.close();
			System.out.println();

			// 배열로 읽기
			reader = new FileReader("C:/Temp/test.txt"); // 한번 닫으면 다시 열어줘야한다
			char[] data = new char[100];

			while (true) {
				int num = reader.read(data);
				if (num == -1)
					break;

				for (int i = 0; i < num; i++) {
					System.out.print(data[i]);
				}
			}
			
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
