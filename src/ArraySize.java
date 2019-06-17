
public class ArraySize {
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0]="Rahul";
		arr[1] = "Sahrukh";
		arr[0] ="Salman";
		System.out.println(arr[1]);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
