
public class ArrayResize {
	public static void main(String[] args) {
		int[]arr = new int[2];
		arr[0]=2;
		arr[1]=4;
		arr = new int[4];
		arr[2]=6;
		arr[3]=10;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}