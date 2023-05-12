package ch15.sec04.exam01;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// Map<key의 타입, 저장할 값의 타입>
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println(map.size());// map은 key값이 같은 데이터를 중복 저장할수없다 홍길동이 2명이지만 값은 1개만 저장된다.

		// 키로 값을 얻기
		String key = "신용권";
		int value = map.get(key);
		

		// 전체 데이터 출력하는 방법1

		// 키를 전부 가져온다.
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {// 키의 갯수만큼 반복한다.
			String k = keyIterator.next(); //키를 하나씩 가져온다.
			int v = map.get(k);
			System.out.println(k + ":" + v);
		}

		// 전체 데이터 출력하는 방법2
		
		
		
		//삭제
		map.remove("홍길동"); //key로 데이터 삭제
		
		Set<String> keySet2 = map.keySet();
		Iterator<String> keyIterator2 = keySet.iterator();

		while (keyIterator2.hasNext()) {// 키의 갯수만큼 반복한다.
			String k = keyIterator2.next(); //키를 하나씩 가져온다.
			int v = map.get(k);
			System.out.println(k + ":" + v);
		}
	}

}
