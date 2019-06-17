
public class ArrayExpectedNew {
	public static void main(String[] args) {
		int j =0;
		String exp = "RAM";
		String[]name ={"JAM","TAM","KAM","RAM","BAM"};
		for(int i=0;i<name.length;i++){
			String act = name[i];
			if(exp.equals(act)){
				System.out.println("Ecxpected String is available");
			}
			else{
				j++;
				if(j==name.length){
					System.out.println("Expected String is not available");
				}
			}
		}
	}
}
