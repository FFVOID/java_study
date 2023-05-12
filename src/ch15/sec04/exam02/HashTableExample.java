package ch15.sec04.exam02;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>(); //Hashtable은 싱크로나이즈가 포함돼있어 동기화가 지원된다. Hashmap은 안된다

		Thread threadA = new Thread() {

			@Override
			public void run() {
				// 1000개의 데이터 추가
				for (int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);// valueof = int형을 string 타입으로 바꿔줌
				}
			}

		};
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					map.put(String.valueOf(i), i);// valueof = int형을 string 타입으로 바꿔줌
				}
			}

		};
		
		//스레드 실행
		threadA.start();
		threadB.start();
		
		try {
			//A,B 스레드가 종료될때까지 메인스레드를 기다리게 한다.(a,b먼저)
			threadA.join();
			threadB.join();
		} catch (Exception e) {

		}
		
		int size = map.size();
		System.out.println(size);
	}

}
