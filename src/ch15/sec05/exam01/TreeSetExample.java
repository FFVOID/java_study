package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		// 기본은 오름차순 정렬,검색
		TreeSet<Integer> scores = new TreeSet<>();

		// 점수저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		// 모든 데이터 출력하기
		for (Integer s : scores) {
			System.out.println(s);
		}

		System.out.println();

		System.out.println("가장 낮은 점수:" + scores.first());
		System.out.println("가장 높은 점수:" + scores.last());

		System.out.println("95점 아래 점수:" + scores.lower(95));
		System.out.println("95점 아래 점수:" + scores.higher(95));

		System.out.println("95점이거나 바로 아래 점수:" + scores.floor(95));
		System.out.println("85점이거나 바로 아래 점수:" + scores.ceiling(85));

		System.out.println();

		// 내림차순 정렬
		NavigableSet<Integer> descendingScores = scores.descendingSet(); // 내림차순정렬
		for (Integer s : descendingScores) {
			System.out.println(s);
		}

		System.out.println();

		// 범위 검색 true = 80이상
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true); // 어떤 값보다 큰값을 구하고 싶을때 ex)false 80초과 값만
		NavigableSet<Integer> rangeSet2 = scores.headSet(80, true); // 어떤 값보다 작은값을 구하는 방법
		for (Integer s : rangeSet2) {
			System.out.println(s);
		}

		System.out.println();

		// 범위 검색 (80<= score < 90 )
		NavigableSet<Integer> rangeSet3 = scores.subSet(80, true, 90, false);
		for (Integer s : rangeSet3) {
			System.out.println(s);
		}

	}
}
