package pop;

public class Pop3 {

	public static void main(String[] args) {
		int[][] array = {
			      {95, 86},
			      {83, 92, 96},
			      {78, 83, 93, 87, 88}
			};
		
		int sum = 0;
		int total = 0;
		
		for (int i=0; i<array.length; i ++) {
			total += array[i].length;
			System.out.println(total);
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
		}
		double avg = (double)sum / total;
		System.out.println("총합:" + sum);
		System.out.println("전체평균:" + avg);
	}

}
