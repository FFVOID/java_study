package ch05.sec03;

public class ReferanceVarialeCompareExample {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3; 
		
		//arr3는 arr2의 주소를 가지고 있따.
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); // 값은같지만 주소가 다르다 = 배열끼리는 주소를 비교하기 때문
		System.out.println(arr2 == arr3);
		
		
	}

}
