import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D://Java.text");
		FileReader fe = new FileReader(file);
	}
}

