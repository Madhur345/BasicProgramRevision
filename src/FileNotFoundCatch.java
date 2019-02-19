import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundCatch {
	public static void main(String[] args) {
		File file = new File ("D://java.txt");
		try {
			FileReader fe = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("exception is handled");
		}

	}
}
