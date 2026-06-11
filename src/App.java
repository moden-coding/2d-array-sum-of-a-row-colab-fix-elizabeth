public class App {
	public static void main(String[] args){
		int[][] a = {
			{5,2,3,7},
			{1,5,2,2},
			{1,2,3,4}
		};
		System.out.println(sumRow(a,2)); //should print 10
		System.out.println(sumRow(a,0)); //should print 17
	}
	public static int sumRow(int[][] array, int row){
		int count = 0;
		for (int i = 0; i < array[0].length; i++){
				// System.out.println(array[row][i]);
			count += array[row][i];
		}
		return count;
	}
	
}
